package com.loanapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loanapplication.entity.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
}
