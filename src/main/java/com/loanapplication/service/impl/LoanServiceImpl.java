package com.loanapplication.service.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.loanapplication.dto.LoanDTO;
import com.loanapplication.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService {

	@Override
	public LoanDTO createLoan(LoanDTO loanDTO) {
		// write your logic here
		return null;
	}

	@Override
	public LoanDTO updateLoanStatus(Long loanId, String newStatus) {
		// write your logic here
		return null;
	}

	@Override
	public Page<LoanDTO> getAllLoans(Pageable pageable) {
		// write your logic here
		return null;
	}

	@Override
	public List<LoanDTO> getLoansByStatus(String status) {
		// write your logic here
		return null;
	}

	@Override
	public LoanDTO getLoanById(Long loanId) {
		// write your logic here
		return null;
	}
}
