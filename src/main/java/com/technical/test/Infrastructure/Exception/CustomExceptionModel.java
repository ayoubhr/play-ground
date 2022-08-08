package com.technical.test.Infrastructure.Exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.sql.Timestamp;


@Data
public class CustomExceptionModel {
    private final String message;
    //private final Throwable throwable;
    private final HttpStatus httpStatus;
    private final Timestamp timestamp;
}
