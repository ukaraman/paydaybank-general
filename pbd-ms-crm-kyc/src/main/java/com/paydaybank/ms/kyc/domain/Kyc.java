package com.paydaybank.ms.kyc.domain;

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
public class Kyc {
    @Id
    private String nationalIdNumber;
    private String lastEmployer;
    private Date startDate;
}
