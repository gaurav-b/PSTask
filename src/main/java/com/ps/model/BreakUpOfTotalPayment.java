package com.ps.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is getting used to hold
 * the total payment payable
 * @author gaurav
 */
public class BreakUpOfTotalPayment {

	private float principalAmt;
	private float interestAmt;
	private float ttlAmtPayable;
	private List<InstallmentSchedule> instScheduleList;
	
	public BreakUpOfTotalPayment() {
		//TODO - non-parameterized constructor
		this.instScheduleList = new ArrayList<>();
	}
	
	public BreakUpOfTotalPayment(float principalAmt, float interestAmt, float ttlAmtPayable) {
		super();
		this.principalAmt = principalAmt;
		this.interestAmt = interestAmt;
		this.ttlAmtPayable = ttlAmtPayable;
	}

	public float getPrincipalAmt() {
		return principalAmt;
	}
	public void setPrincipalAmt(float principalAmt) {
		this.principalAmt = principalAmt;
	}
	public float getInterestAmt() {
		return interestAmt;
	}
	public void setInterestAmt(float interestAmt) {
		this.interestAmt = interestAmt;
	}
	public float getTtlAmtPayable() {
		return ttlAmtPayable;
	}
	public void setTtlAmtPayable(float ttlAmtPayable) {
		this.ttlAmtPayable = ttlAmtPayable;
	}
	public void addPrincipalAmt(float principalAmt) {
		this.principalAmt += principalAmt;
	}
	public void addInterestAmt(float interestAmt) {
		this.interestAmt += interestAmt;
	}
	public void addTtlAmtPayable(float ttlAmtPayable) {
		this.ttlAmtPayable += ttlAmtPayable;
	}
	public List<InstallmentSchedule> getInstScheduleList() {
		return instScheduleList;
	}
	public void setInstScheduleList(List<InstallmentSchedule> instScheduleList) {
		this.instScheduleList = instScheduleList;
	}

	@Override
	public String toString() {
		return "Break Up Of Total Payment [Total Principal Payable = " + principalAmt + ", Total Interest Payable = " + interestAmt
				+ ", Total Amount Payable = " + ttlAmtPayable + "]";
	}
}
