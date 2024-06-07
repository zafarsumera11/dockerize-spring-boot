package com.springboot.dockerize_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DockerizeSpringBootApplication {

	
	@GetMapping("/Message")
	public String getMessage()
	{
	return "SUMERA SAYS HELLO";
	}
			public static void main(String[] args) {
		SpringApplication.run(DockerizeSpringBootApplication.class, args);
	}

}
