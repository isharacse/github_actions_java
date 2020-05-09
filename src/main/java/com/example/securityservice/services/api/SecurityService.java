package com.example.securityservice.services.api;

import com.example.securityservice.domain.Security;

import java.util.List;

public interface SecurityService {
    List<Security> getAllSecurities();
}
