package com.paydaybank.ms.communication.domain;

import com.paydaybank.ms.communication.constants.EmailStatus;
import com.paydaybank.ms.user.domain.User;
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
public class Email {
    @Id
    private String EmailSubject;
    private String EmailContent;
    private EmailStatus status;
    private Date sendDate;
    private User user;
}
