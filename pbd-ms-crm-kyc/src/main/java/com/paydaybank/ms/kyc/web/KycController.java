package com.paydaybank.ms.kyc.web;


import com.paydaybank.ms.kyc.domain.Kyc;
import com.paydaybank.ms.kyc.domain.KycDTO;
import com.paydaybank.ms.kyc.service.KycService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kyc")
public class KycController {

    private final KycService KycService;

    public KycController(KycService kycService) {
        this.KycService = kycService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody KycDTO KycDTO){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        KycService.create(authentication.getName() , KycDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/summary")
    public ResponseEntity<List<Kyc>> summary(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        List<Kyc> KycList = KycService.getActiveKycList(authentication.getName());
        return ResponseEntity.ok(KycList);
    }

}
