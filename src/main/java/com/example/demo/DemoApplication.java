//DemoApplication.java:
// This is the main entry point for your Spring Boot application, containing the main method to run the application.



//This flow showcases how the project layers interact:
//Controller accepts an HTTP request.
//Service processes the request with business logic.
//Repository interacts with the database.
package com.example.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
}
