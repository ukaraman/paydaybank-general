package com.paydaybank.ms.account.domain;

import com.paydaybank.ms.account.constants.AccountStatus;
import com.paydaybank.ms.account.constants.AccountType;
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
public class Account {
    @Id
    private String number;
    private String userName;
    private AccountType type;
    private AccountStatus status;
    private BigDecimal balance;
    private Date insertDate;
    
	public void setInsertDate(Date date) {
        insertDate = date;
	}
	public void setType(AccountType type2) {
        type = type2;
	}
	public void setUserName(String username2) {
        userName = username2;
	}
	public void setStatus(AccountStatus active) {
        status =  active;
	}
	public void setBalance(BigDecimal zero) {
        balance =  zero;
	}
	public void setNumber(String generateAccountNumber) {
        number = generateAccountNumber;
	}
}
