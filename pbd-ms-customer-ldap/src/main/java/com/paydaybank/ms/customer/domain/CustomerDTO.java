package com.paydaybank.ms.customer.domain;

import com.paydaybank.ms.customer.constants.CustomerType;

public class CustomerDTO {

    private CustomerType type;

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }
}
