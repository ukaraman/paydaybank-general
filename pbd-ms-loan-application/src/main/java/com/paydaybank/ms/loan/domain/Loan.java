package com.paydaybank.ms.loan.domain;

import com.paydaybank.ms.loan.constants.LoanStatus;
import com.paydaybank.ms.loan.constants.LoanType;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Loan {
    @Id
    private String nationalIdNumber;
    private BigDecimal amount;
    private Integer months;
    private Date insertDate;
    private LoanType type;
    private LoanStatus status;   
}
