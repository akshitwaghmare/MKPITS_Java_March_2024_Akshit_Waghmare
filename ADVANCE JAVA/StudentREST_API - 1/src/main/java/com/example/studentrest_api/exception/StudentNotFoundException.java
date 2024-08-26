package com.example.studentrest_api.exception;

import java.io.Serial;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String msg ) {
        super(msg);
    }
}
