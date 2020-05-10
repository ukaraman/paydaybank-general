package com.paydaybank.ms.communication.service;

import com.paydaybank.ms.communication.domain.Email;
import com.paydaybank.ms.communication.domain.EmailDTO;

import java.util.List;

public interface EmailService {

    Email create(User user, EmailDTO dto);
    EmailStatus sendEmailByUserIdAndGetStatus(User user);
    
}
