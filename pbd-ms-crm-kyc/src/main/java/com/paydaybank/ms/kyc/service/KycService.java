package com.paydaybank.ms.kyc.service;

import com.paydaybank.ms.kyc.domain.Kyc;
import com.paydaybank.ms.kyc.domain.KycDTO;

import java.util.List;

public interface KycService {

    Kyc create(String username, KycDTO dto);
    List<Kyc> getActiveKycList(String username);

}
