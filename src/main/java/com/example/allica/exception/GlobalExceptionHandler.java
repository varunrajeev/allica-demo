package com.example.allica.exception;

import com.example.allica.dto.ResponseObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AllicaException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ResponseObject<Object> handleBadRequestException(AllicaException ex) {
        return new ResponseObject<>("Error occurred:: " + ex.getMessage(), null);
    }
}