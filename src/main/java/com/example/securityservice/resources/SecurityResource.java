package com.example.securityservice.resources;

import com.example.securityservice.domain.Security;
import com.example.securityservice.services.api.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class SecurityResource {
    @Autowired
    private SecurityService securityService;

    @GetMapping(path = "/securities")
    Collection<Security> getAllSecurities() {
        return securityService.getAllSecurities();
    }

    @GetMapping(path="/security")
    Security getSecurity(@RequestParam(name="id", required=true) String ticker) {
        return securityService.getSecurityByTicker(ticker);
    }
}
