package com.ps.model;

import java.math.BigDecimal;

/**
 * This class is getting used to hold 
 * the loan details after input and populated
 * @author gaurav
 */
public class LoanDetails {

	private BigDecimal loanAmount;
	private float roi;
	private int tenure;
	private String installmentFrequency;
	private int noOfInstallmentRelax;
	
	private int noOfInstallments;
	private double installmentAmt;
	private double emiInterestRate;
	
	public LoanDetails() {
		//TODO - non-parameterized constructor
	}
	
	public LoanDetails(BigDecimal loanAmount, float roi, int tenure, 
			String installmentFrequency, int noOfInstallmentRelax) {
		super();
		this.loanAmount = loanAmount;
		this.roi = roi;
		this.tenure = tenure;
		this.installmentFrequency = installmentFrequency;
		this.noOfInstallmentRelax = noOfInstallmentRelax;
	}
	
	public BigDecimal getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}
	public float getRoi() {
		return roi;
	}
	public void setRoi(float roi) {
		this.roi = roi;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public String getInstallmentFrequency() {
		return installmentFrequency;
	}
	public void setInstallmentFrequency(String installmentFrequency) {
		this.installmentFrequency = installmentFrequency;
	}
	public int getNoOfInstallmentRelax() {
		return noOfInstallmentRelax;
	}
	public void setNoOfInstallmentRelax(int noOfInstallmentRelax) {
		this.noOfInstallmentRelax = noOfInstallmentRelax;
	}
	public int getNoOfInstallments() {
		return noOfInstallments;
	}
	public void setNoOfInstallments(int noOfInstallments) {
		this.noOfInstallments = noOfInstallments;
	}
	public double getInstallmentAmt() {
		return installmentAmt;
	}
	public void setInstallmentAmt(double installmentAmt) {
		this.installmentAmt = installmentAmt;
	}
	public double getEmiInterestRate() {
		return emiInterestRate;
	}
	public void setEmiInterestRate(double emiInterestRate) {
		this.emiInterestRate = emiInterestRate;
	}

	@Override
	public String toString() {
		return "LoanDetails [loanAmount=" + loanAmount + ", roi=" + roi + ", tenure=" + tenure
				+ ", installmentFrequency=" + installmentFrequency + ", noOfInstallmentRelax=" + noOfInstallmentRelax
				+ ", noOfInstallments=" + noOfInstallments + ", installmentAmt=" + installmentAmt + ", emiInterestRate="
				+ emiInterestRate + "]";
	}
}
