package com.paydaybank.ms.Loan.service;

import com.paydaybank.ms.Loan.domain.Loan;
import com.paydaybank.ms.Loan.domain.LoanDTO;

import java.util.List;

public interface LoanApplicationService {

    Loan create(String idNumber, LoanDTO dto);
    List<Loan> getLoanResultByIdandDate(String idNumber);

}
