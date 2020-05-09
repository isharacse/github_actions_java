package com.example.securityservice.services.api;

import com.example.securityservice.domain.Security;

import java.util.Collection;

public interface SecurityService {
    Collection<Security> getAllSecurities();

    Security getSecurityByTicker(String ticker);
}
