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
        securities.put("TDDD123", new Security("TDDD123", "SED123", "Apple Inc."));
        securities.put("TDDD345", new Security("TDDD345", "SED345", "Alphabet"));
        securities.put("TDDD678", new Security("TDDD678", "SED678", "IBM"));
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
