package com.paydaybank.ms.communication.repository;

import com.paydaybank.ms.communication.constants.EmailStatus;
import com.paydaybank.ms.communication.domain.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmailRepository  extends JpaRepository<Email,String> {

    EmailStatus sendEmailByUserIdAndGetStatus(User user);
}
