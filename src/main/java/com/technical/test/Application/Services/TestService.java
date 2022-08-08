package com.technical.test.Application.Services;

import com.technical.test.Application.RepositoryImpl.TestRepositoryImpl;
import com.technical.test.Domain.Model.DriversResponse;
import com.technical.test.Infrastructure.Exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    TestRepositoryImpl testRepository;

    public DriversResponse driverData() {
        return testRepository.data();
    }

    public ResponseEntity<Void> useCustomException() {
        throw new CustomException("A custom exception has been thrown.");
    }
}
