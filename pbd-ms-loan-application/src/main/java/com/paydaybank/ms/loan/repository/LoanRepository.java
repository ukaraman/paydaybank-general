package com.paydaybank.ms.loan.repository;

import com.paydaybank.ms.loan.constants.LoanStatus;
import com.paydaybank.ms.account.domain.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository  extends JpaRepository<Account,String> {

    List<Loan> getLoanResultByIdandDate(String idNumber, Date applicationDate);
}
