package com.loanapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loanapplication.service.BankService;

@RestController
@RequestMapping("/api/banks")
public class BankController {

	private final BankService bankService = null;

}