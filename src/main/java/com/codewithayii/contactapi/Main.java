package com.codewithayii.contactapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.codewithayii.repo")
public class Main {
// Yooo
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
