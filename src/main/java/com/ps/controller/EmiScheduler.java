package com.ps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ps.model.BreakUpOfTotalPayment;
import com.ps.model.LoanDetails;
import com.ps.service.LoanService;

@RestController
public class EmiScheduler {

	@Autowired
	private LoanService loanService;
	
	/**
	 * Method to schedule and print EMI schedule
	 * as per loan details provided as JSON 
	 */
	@PostMapping("/schedule")
	public BreakUpOfTotalPayment scheduleEmi(@RequestBody LoanDetails loanDetails) {
		LoanDetails lDetails = loanService.populateLoanDetails(loanDetails); // to populate the LoanDetails as per the inputs
		BreakUpOfTotalPayment ttlPmt = loanService.populateEmiSchedule(lDetails); // to determine the EMI schedule
		return ttlPmt;
	}
}