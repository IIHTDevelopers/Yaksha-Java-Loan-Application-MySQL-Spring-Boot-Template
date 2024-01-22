package com.loanapplication.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.loanapplication.dto.BankDTO;
import com.loanapplication.service.BankService;

@Service
public class BankServiceImpl implements BankService {

	@Override
	public BankDTO createBank(BankDTO bankDTO) {
		// write your logic here
		return null;
	}

	@Override
	public List<BankDTO> getAllBanks() {
		// write your logic here
		return null;
	}

	@Override
	public BankDTO getBankById(Long bankId) {
		// write your logic here
		return null;
	}

	@Override
	public boolean deleteBank(Long bankId) {
		// write your logic here
		return false;
	}

	@Override
	public BankDTO updateBank(Long bankId, BankDTO bankDTO) {
		// write your logic here
		return null;
	}

	@Override
	public List<BankDTO> getAllBanksWithInterestRateBelow(double interestRate) {
		// write your logic here
		return null;
	}
}
