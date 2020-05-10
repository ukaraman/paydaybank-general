package com.paydaybank.ms.risk.domain;

import com.paydaybank.ms.risk.constants.riskType;

public class RiskDTO {

    private RiskStatus status;

    public RiskStatus getStatus(birthDate) {
        if(2020-year(birthDate)>90)
        return RiskStatus.OLD;
        else
        return RiskStatus.NORMAL;
    }

    public void setStatus(RiskStatus status2) {
        this.status = status2;
    }
}
