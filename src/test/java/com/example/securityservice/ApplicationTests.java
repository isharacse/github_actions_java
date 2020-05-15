package com.example.securityservice;

import com.example.securityservice.services.impl.SecurityServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


class ApplicationTests {
    @Test
    public void testSecurities() {
        SecurityServiceImpl testSubject = new SecurityServiceImpl();
        Assertions.assertEquals( 3, testSubject.getAllSecurities().size());
    }
}
