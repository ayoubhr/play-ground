package com.technical.test.Domain.Model;

import lombok.Data;

import java.util.List;

@Data
public class DriversResponse {
    List<DriverData> drivers;
}
