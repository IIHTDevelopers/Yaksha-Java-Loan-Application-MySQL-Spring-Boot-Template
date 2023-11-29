package com.loanapplication.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.loanapplication.dto.LoanDTO;
import com.loanapplication.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService {

	@Override
	public LoanDTO createLoan(LoanDTO loanDTO) {
		return null;
	}

	@Override
	public LoanDTO updateLoanStatus(Long loanId, String newStatus) {
		return null;
	}

	@Override
	public List<LoanDTO> getAllLoans() {
		return null;
	}

	@Override
	public List<LoanDTO> getLoansByStatus(String status) {
		return null;
	}

	@Override
	public LoanDTO getLoanById(Long loanId) {
		return null;
	}
}
