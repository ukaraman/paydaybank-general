package com.paydaybank.ms.loan.domain;

import com.paydaybank.ms.loan.constants.LoanType;

public class LoanDTO {

    private LoanType type;

    public LoanType getType() {
        return type;
    }

    public void setType(LoanType type) {
        this.type = type;
    }
}
