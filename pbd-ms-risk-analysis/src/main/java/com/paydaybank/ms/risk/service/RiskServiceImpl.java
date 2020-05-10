package com.paydaybank.ms.risk.service;

import com.paydaybank.ms.risk.constants.RiskStatus;
import com.paydaybank.ms.risk.domain.risk;
import com.paydaybank.ms.risk.domain.riskDTO;
import com.paydaybank.ms.risk.repository.RiskRepository;
import com.paydaybank.ms.risk.util.RiskUtil;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class riskServiceImpl implements RiskService {

    private final RiskRepository riskRepository;

    public RiskServiceImpl(RiskRepository riskRepository) {
        this.riskRepository = riskRepository;
    }

    @Override
    public Risk create(String id, RiskDTO dto) {
        risk risk = new risk();
        risk.setIdNumber(idNumber);
        risk.setStatus(status);
        risk.setInsertBirthDate(birthDate);
        return riskRepository.save(risk);
    }

    @Override
    public RiskStatus get(String username) {
        return riskRepository.getriskListByUserNameAndStatus(username, riskStatus.ACTIVE);
    }
}
