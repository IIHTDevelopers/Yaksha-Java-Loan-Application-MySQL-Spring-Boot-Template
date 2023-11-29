package com.loanapplication.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.loanapplication.dto.BankDTO;
import com.loanapplication.service.BankService;

@Service
public class BankServiceImpl implements BankService {

	@Override
	public BankDTO createBank(BankDTO bankDTO) {
		return null;
	}

	@Override
	public List<BankDTO> getAllBanks() {
		return null;
	}

	@Override
	public BankDTO getBankById(Long bankId) {
		return null;
	}

	@Override
	public boolean deleteBank(Long bankId) {
		return false;
	}

	@Override
	public BankDTO updateBank(Long bankId, BankDTO bankDTO) {
		return null;
	}
}
