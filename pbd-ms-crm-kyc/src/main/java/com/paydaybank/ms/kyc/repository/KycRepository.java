package com.paydaybank.ms.kyc.repository;

import com.paydaybank.ms.kyc.constants.AccountStatus;
import com.paydaybank.ms.kyc.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KycRepository  extends JpaRepository<Kyc,String> {

    String getEmployerByNationalIdNumber(String nationalIdNumber);
}
