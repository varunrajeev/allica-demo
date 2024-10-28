package com.example.allica.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class AllicaException extends RuntimeException {

    public AllicaException(String message) {
        super(message);
    }

}
