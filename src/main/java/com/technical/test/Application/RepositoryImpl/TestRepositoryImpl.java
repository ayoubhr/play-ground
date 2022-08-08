package com.technical.test.Application.RepositoryImpl;

import com.technical.test.Domain.Model.DriversResponse;
import com.technical.test.Domain.Repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepositoryImpl implements TestRepository {

    @Autowired
    ApplicationContext context;

    @Override
    public DriversResponse data() {
        return context.getBean(DriversResponse.class);
    }
}
