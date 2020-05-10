package com.paydaybank.ms.kyc.service;

import com.paydaybank.ms.kyc.domain.Kyc;
import com.paydaybank.ms.kyc.domain.KycDTO;
import com.paydaybank.ms.kyc.repository.KycRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class KycServiceImpl implements kycService {

    private final KycRepository kycRepository;

    public KycServiceImpl(kycRepository kycRepository) {
        this.kycRepository = kycRepository;
    }

    @Override
    public kyc create(String username, KycDTO dto) {
        kyc kyc = new kyc();
        kyc.setNationalIdNumber(dto.getNationalIdNumber());
        kyc.setEmployerName(username);
        kyc.setStartDate(new Date());
        return kycRepository.save(kyc);
    }

    @Override
    public String getEmployerByNationalIdNumber(String nationalIdNumber) {
        return KycRepository.getEmployerByNationalIdNumber(nationalIdNumber);
    }
}
