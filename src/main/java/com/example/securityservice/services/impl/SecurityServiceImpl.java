package com.example.securityservice.services.impl;

import com.example.securityservice.domain.Security;
import com.example.securityservice.services.api.SecurityService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Collection;
import java.util.Map;

@Service
public class SecurityServiceImpl implements SecurityService {
    Map<String, Security> securities = new HashMap<>();

    public SecurityServiceImpl() {
        securities.put("T123", new Security("T123", "SED123", "Apple Inc."));
        securities.put("T345", new Security("T345", "SED345", "Alphabet"));
        securities.put("T678", new Security("TI678", "SED678", "IBM"));
    }

    @Override
    public Collection<Security> getAllSecurities() {
        return securities.values();
    }

    @Override
    public Security getSecurityByTicker(String ticker) {
        return securities.get(ticker);
    }
}
