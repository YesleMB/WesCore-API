package com.wescore.api.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public String handleException(Exception ex) {
        return "Ocorreu um erro: " + ex.getMessage();
    }
}
