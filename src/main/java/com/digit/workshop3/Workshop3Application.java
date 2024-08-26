package com.digit.workshop3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.digit.workshop3")
public class Workshop3Application {
	public static void main(String[] args) {
		SpringApplication.run(Workshop3Application.class, args);
	}
}
