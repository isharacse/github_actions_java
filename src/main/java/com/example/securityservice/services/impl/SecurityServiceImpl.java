package com.example.securityservice.services.impl;

import com.example.securityservice.domain.Security;
import com.example.securityservice.services.api.SecurityService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SecurityServiceImpl implements SecurityService {
    List<Security> securities = new ArrayList<Security>();

    public SecurityServiceImpl() {
        securities.add(new Security("T123", "SED123", "Apple Inc."));
        securities.add(new Security("T345", "SED345", "Alphabet"));
        securities.add(new Security("TI678", "SED678", "IBM"));
    }

    @Override
    public List<Security> getAllSecurities() {
        return securities;
    }
}
