package com.technical.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.technical.test.Domain.Model.DriversResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ResourceLoader;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@Bean
	@Scope("singleton")
	DriversResponse driversDataBean() {
		ObjectMapper mapper = new ObjectMapper();
		DriversResponse response = new DriversResponse();
		try {
			response = mapper.readValue(new File("src/main/resources/data.json"), DriversResponse.class);
			System.out.println(response);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;
	}
}
