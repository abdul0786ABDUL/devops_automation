package com.example.Command;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBoootDockerPipelineApplication {
	
	@GetMapping
	public String message() {
		return"Welcome to jenkins Pipeline";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBoootDockerPipelineApplication.class, args);
	}

}
