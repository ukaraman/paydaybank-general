package com.paydaybank.ms.loan.service;

import com.paydaybank.ms.loan.constants.LoanStatus;
import com.paydaybank.ms.loan.constants.LoanType;
import com.paydaybank.ms.loan.domain.Loan;
import com.paydaybank.ms.loan.domain.LoanDTO;
import com.paydaybank.ms.loan.repository.LoanRepository;
import com.paydaybank.ms.loan.util.LoanUtil;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class LoanServiceImpl implements LoanService {

    private final LoanRepository LoanRepository;
    private final int DEFAULT_LOAN_NUMBER_MONTHS = 24;

    public LoanServiceImpl(LoanRepository LoanRepository) {
        this.LoanRepository = LoanRepository;
    }

    @Override
    public Loan create(String nationalIdNumber, LoanDTO dto) {
        Loan Loan = new Loan();
        //Loan.setType(dto.getType());
        Loan.setNationalIdNumber(nationalIdNumber);
        //Loan.setStatus(LoanStatus.ACCEPT);
        Loan.setAmount(50000);
        Loan.setInsertDate(new Date());
        Loan.setMonths(LoanUtil.generateLoanNumber(DEFAULT_LOAN_NUMBER_MONTHS));
        return LoanRepository.save(Loan);
    }

    @Override
    public List<Loan> getActiveLoanList(String nationalIdNumber) {
        return LoanRepository.getLoanListByUserNameAndStatus(nationalIdNumber, LoanStatus.ACTIVE);
    }
}
