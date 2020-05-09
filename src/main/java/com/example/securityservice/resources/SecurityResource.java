package com.example.securityservice.resources;

import com.example.securityservice.domain.Security;
import com.example.securityservice.services.api.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SecurityResource {
    @Autowired
    private SecurityService securityService;

    @GetMapping(path = "/securities")
    List<Security> getAllSecurities() {
        return securityService.getAllSecurities();
    }
}
