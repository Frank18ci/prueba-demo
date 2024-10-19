package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo1.model.Employee;

@SpringBootApplication
@EnableTransactionManagement
public class EmployApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployApplication.class, args);
	}

}
