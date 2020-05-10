package com.paydaybank.ms.communication.service;

import com.paydaybank.ms.communication.constants.EmailStatus;
import com.paydaybank.ms.communication.domain.Email;
import com.paydaybank.ms.communication.domain.EmailDTO;
import com.paydaybank.ms.communication.repository.EmailRepository;
import com.paydaybank.ms.communication.util.EmailUtil;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class EmailServiceImpl implements EmailService {

    private final EmailRepository EmailRepository;

    public EmailServiceImpl(EmailRepository EmailRepository) {
        this.EmailRepository = EmailRepository;
    }

    @Override
    public Email create(User user, EmailDTO dto) {
        Email Email = new Email();
        Email.setEmailAdress(user.getEmailAddress());
        Email.setEmailSubject("IBAR TEST EMAIL");
        Email.setEmailContent("TEST ACCOUNT DETAILS TEST ACCOUNT DETAILS");
        Email.setInsertDate(new Date());
        Email.setNumber(EmailUtil.generateEmailNumber(DEFAULT_Email_NUMBER_LENGTH));
        return EmailRepository.save(Email);
    }

    @Override
    public EmailStatus sendEmailByUserIdAndGetStatus(User user) {
        return EmailRepository.sendEmailByUserIdAndGetStatus(User user);
    }
}
