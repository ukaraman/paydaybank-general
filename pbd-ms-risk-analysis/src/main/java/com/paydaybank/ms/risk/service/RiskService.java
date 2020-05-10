package com.paydaybank.ms.risk.service;

import com.paydaybank.ms.risk.domain.risk;
import com.paydaybank.ms.risk.domain.riskDTO;

import java.util.List;

public interface RiskService {

    risk create(String id, riskDTO dto);
    RiskStatus getStatus(String id);
}
