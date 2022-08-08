package com.technical.test.Domain.Model;

import lombok.Data;

@Data
public class DriverData {
    private String _id;
    private String picture;
    private int age;
    private String name;
    private String team;
    private Races[] races = new Races[10];

    public DriverData(){
    }
}
