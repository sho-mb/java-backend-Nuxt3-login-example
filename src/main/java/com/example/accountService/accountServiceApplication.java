package com.example.accountService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.accountService")
public class accountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(accountServiceApplication.class, args);
	}

}
