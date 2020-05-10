package com.paydaybank.ms.risk.domain;

import com.paydaybank.ms.risk.constants.riskStatus;
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
public class Risk {
    @Id
    private String idNumber;
    private RiskStatus status;
    private Date birthDate;
}
