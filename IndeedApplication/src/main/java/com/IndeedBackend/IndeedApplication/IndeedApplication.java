package com.IndeedBackend.IndeedApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;


@SpringBootApplication
public class IndeedApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndeedApplication.class, args);
	}

}
