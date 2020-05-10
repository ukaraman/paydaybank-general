package com.paydaybank.ms.communication.web;


import com.paydaybank.ms.communication.domain.Email;
import com.paydaybank.ms.communication.domain.EmailDTO;
import com.paydaybank.ms.communication.service.EmailService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/email")
public class EmailController {

    private final EmailService EmailService;

    public EmailController(EmailService emailService) {
        this.EmailService = emailService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody EmailDTO emailDTO){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        EmailService.create(authentication.getName() , emailDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/summary")
    public ResponseEntity<EmailStatus> summary(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        EmailStatus status = EmailService.sendEmailByUserIdAndGetStatus(User user);
        return ResponseEntity.ok(status);
    }

}
