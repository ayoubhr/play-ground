package com.technical.test.Infrastructure.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.Timestamp;

@ControllerAdvice
public class Handler {

    @ExceptionHandler(value = {CustomException.class} )
    public ResponseEntity<Object> handleCustomException(CustomException e) throws CustomException {
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        CustomExceptionModel cem = new CustomExceptionModel(
                e.getMessage(),
                badRequest,
                new Timestamp(System.currentTimeMillis())
        );
        return new ResponseEntity<>(cem, badRequest);
    }
}
