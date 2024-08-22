package com.example.springboot2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    public Account account;
    
    @Autowired
    public DemoController(@Qualifier("current") Account account) {
        this.account = account;
    }
    @GetMapping("/details")
    public String details() {
        return account.getAccName();
    }
}
