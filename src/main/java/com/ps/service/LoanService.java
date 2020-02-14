package com.ps.service;

import org.springframework.stereotype.Service;

import com.ps.constant.InstallmentFrequency;
import com.ps.model.BreakUpOfTotalPayment;
import com.ps.model.InstallmentSchedule;
import com.ps.model.LoanDetails;

@Service
public class LoanService {

	public LoanDetails populateLoanDetails(LoanDetails lDetails) {

		float interestRate = (float) (lDetails.getRoi()/100.0);
		
		switch (lDetails.getInstallmentFrequency()) {
		case InstallmentFrequency.MONTHLY:
			lDetails.setNoOfInstallments(lDetails.getTenure());
			lDetails.setEmiInterestRate(interestRate/12);
			lDetails.setInstallmentAmt((lDetails.getLoanAmount().floatValue() * lDetails.getEmiInterestRate())/(1-Math.pow(1+lDetails.getEmiInterestRate(), -lDetails.getNoOfInstallments())));
			break;
		case InstallmentFrequency.BI_MONTHLY:
			lDetails.setNoOfInstallments(lDetails.getTenure()*2);
			lDetails.setEmiInterestRate((interestRate/(12*30))*15);
			lDetails.setInstallmentAmt((lDetails.getLoanAmount().floatValue() * lDetails.getEmiInterestRate())/(1-Math.pow(1+lDetails.getEmiInterestRate(), -lDetails.getNoOfInstallments())));
			break;
		default:
			break;
		}
		
		return lDetails;
	}
	
	public BreakUpOfTotalPayment populateEmiSchedule(LoanDetails lDetails) {
		
		float loanAmount = lDetails.getLoanAmount().floatValue();
		
		// domain to hold break up of total payment
		BreakUpOfTotalPayment ttlPmt = new BreakUpOfTotalPayment();
		
		for (int i = 1; i <= lDetails.getNoOfInstallments(); i++) {
			InstallmentSchedule iSchedule = new InstallmentSchedule();
			iSchedule.setInstallmentNo(i);
			iSchedule.setOpeningBalance(loanAmount);
			iSchedule.setInterestPaid((float)(loanAmount*(lDetails.getEmiInterestRate())));
			iSchedule.setPrincipalRepaid((float)(lDetails.getInstallmentAmt()-(iSchedule.getInterestPaid())));
			
			// relaxation on interest payment for the given number of months 
			if (i<=lDetails.getNoOfInstallmentRelax()) 
				iSchedule.setInterestPaid(0);	
			
			ttlPmt.addInterestAmt(iSchedule.getInterestPaid());
			ttlPmt.addPrincipalAmt(iSchedule.getPrincipalRepaid());
			
			iSchedule.setClosingBalance(loanAmount-iSchedule.getPrincipalRepaid());
			loanAmount=iSchedule.getClosingBalance();
			
			ttlPmt.getInstScheduleList().add(new InstallmentSchedule()
												.setInstallmentNo(iSchedule)
												.setRoundedOpeningBalance(iSchedule)
												.setRoundedInterestPaid(iSchedule)
												.setRoundedPrinipalRepaid(iSchedule)
												.setRoundedClosingBalance(iSchedule));
		}

		ttlPmt.addTtlAmtPayable(ttlPmt.getPrincipalAmt()+ttlPmt.getInterestAmt());

		return ttlPmt;
	}
}
