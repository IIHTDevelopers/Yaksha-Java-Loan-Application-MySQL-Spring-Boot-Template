package com.loanapplication.dto;

public class BankDTO {
	private Long id;

	private String name;

	private String loanType;

	private double interestRate;

	public BankDTO() {
		super();
	}

	public BankDTO(Long id, String name, String loanType, double interestRate) {
		super();
		this.id = id;
		this.name = name;
		this.loanType = loanType;
		this.interestRate = interestRate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "BankDTO [id=" + id + ", name=" + name + ", loanType=" + loanType + ", interestRate=" + interestRate
				+ "]";
	}
}
