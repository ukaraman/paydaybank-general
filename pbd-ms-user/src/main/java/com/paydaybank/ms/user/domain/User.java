package com.paydaybank.ms.user.domain;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    @Id
    private String emailAddress;
    private String password;
    //private String firstName;
    //private String lastName;
    //private String phoneNumber;
    //private Gender gender;
    //private Date dateOfBirth;
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String encode) {
        password = encode;
	}
}
