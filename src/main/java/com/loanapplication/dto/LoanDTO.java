package com.loanapplication.dto;

public class LoanDTO {
	private Long id;

	private String applicantName;

	private BankDTO bankInfo;

	private String status;

	public LoanDTO() {
		super();
	}

	public LoanDTO(Long id, String applicantName, BankDTO bankInfo, String status) {
		super();
		this.id = id;
		this.applicantName = applicantName;
		this.bankInfo = bankInfo;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public BankDTO getBankInfo() {
		return bankInfo;
	}

	public void setBankInfo(BankDTO bankInfo) {
		this.bankInfo = bankInfo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LoanDTO [id=" + id + ", applicantName=" + applicantName + ", bankInfo=" + bankInfo + ", status="
				+ status + "]";
	}
}
