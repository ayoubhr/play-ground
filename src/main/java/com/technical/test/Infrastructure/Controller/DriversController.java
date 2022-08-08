package com.technical.test.Infrastructure.Controller;

import com.technical.test.Application.Services.TestService;
import com.technical.test.Domain.Model.DriversResponse;
import com.technical.test.Infrastructure.Exception.CustomException;
import com.technical.test.Infrastructure.Exception.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping()
public class DriversController {

    @Autowired
    TestService testService;

    @GetMapping("/ds")
    @ResponseBody
    public ResponseEntity<DriversResponse> getData() {
        return ResponseEntity.ok().body(testService.driverData());
    }

    @GetMapping("test-exception")
    public ResponseEntity<Void> test4() throws CustomException {
        return testService.useCustomException();
    }
}
