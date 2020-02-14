package com.ps.model;

/**
 * This class is getting used to hold 
 * the single installment details
 * @author gaurav
 */
public class InstallmentSchedule {

	private int installmentNo;
	private float openingBalance;
	private float interestPaid;
	private float principalRepaid;
	private float closingBalance;
	
	public InstallmentSchedule() {
		//TODO - non-parameterized constructor
	}
	
	public InstallmentSchedule(int installmentNo, float openingBalance, float interestPaid, float principalRepaid,float closingBalance) {
		super();
		this.installmentNo = installmentNo;
		this.openingBalance = openingBalance;
		this.interestPaid = interestPaid;
		this.principalRepaid = principalRepaid;
		this.closingBalance = closingBalance;
	}
	
	public int getInstallmentNo() {
		return installmentNo;
	}
	public void setInstallmentNo(int installmentNo) {
		this.installmentNo = installmentNo;
	}
	public float getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(float openingBalance) {
		this.openingBalance = openingBalance;
	}
	public float getInterestPaid() {
		return interestPaid;
	}
	public void setInterestPaid(float interestPaid) {
		this.interestPaid = interestPaid;
	}
	public float getPrincipalRepaid() {
		return principalRepaid;
	}
	public void setPrincipalRepaid(float principalRepaid) {
		this.principalRepaid = principalRepaid;
	}
	public float getClosingBalance() {
		return closingBalance;
	}
	public void setClosingBalance(float closingBalance) {
		this.closingBalance = closingBalance;
	}
	
	public InstallmentSchedule setInstallmentNo(InstallmentSchedule instSchedule) {
		this.installmentNo = instSchedule.getInstallmentNo();
		return this;
	}
	public InstallmentSchedule setRoundedOpeningBalance(InstallmentSchedule instSchedule) {
		this.openingBalance = Math.round(instSchedule.getOpeningBalance());
		return this;
	}
	public InstallmentSchedule setRoundedInterestPaid(InstallmentSchedule instSchedule) {
		this.interestPaid = Math.round(instSchedule.getInterestPaid());
		return this;
	}
	public InstallmentSchedule setRoundedPrinipalRepaid(InstallmentSchedule instSchedule) {
		this.principalRepaid = Math.round(instSchedule.getPrincipalRepaid());
		return this;
	}
	public InstallmentSchedule setRoundedClosingBalance(InstallmentSchedule instSchedule) {
		this.closingBalance = Math.round(instSchedule.getClosingBalance());
		return this;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Installment:"+getInstallmentNo());
		builder.append("\t(Opening-Balance):"+Math.round(getOpeningBalance()));
		builder.append("\t(Interest-paid-during-the-installment)"+Math.round(getInterestPaid()));
		builder.append("\t(Principal-repaid-during-the-installment):"+Math.round(getPrincipalRepaid()));
		builder.append("\t(Closing-Balance):"+Math.round(getClosingBalance()));
		return builder.toString();
	}
}
