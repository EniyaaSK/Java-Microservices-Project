package com.example.beneficiary_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BeneficiaryCrudApplication {

	public static void main(String[] args) {

		SpringApplication.run(BeneficiaryCrudApplication.class, args);
	}

}
