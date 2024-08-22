package com.example.springboot2;

import org.springframework.stereotype.Component;

@Component
public class Current implements Account{
    @Override
    public String getAccName() {
        return "This is the Current Account";
    }
}
