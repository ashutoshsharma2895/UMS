package com.example.UMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(UMSApplication.class, args);
	}
}
