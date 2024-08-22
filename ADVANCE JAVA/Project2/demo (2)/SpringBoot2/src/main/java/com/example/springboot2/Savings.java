package com.example.springboot2;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.lang.model.element.Name;

@Component
public class Savings implements Account{
    @Override
    public String getAccName() {
        return "This is Savings Account";
    }

}

