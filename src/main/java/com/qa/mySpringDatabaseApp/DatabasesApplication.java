package com.qa.mySpringDatabaseApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DatabasesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabasesApplication.class, args);
	}
}
