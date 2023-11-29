package com.loanapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loanapplication.service.LoanService;

@RestController
@RequestMapping("/api/loans")
public class LoanController {

	private final LoanService loanService = null;

}
