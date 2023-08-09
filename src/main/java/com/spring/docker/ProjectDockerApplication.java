package com.spring.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjectDockerApplication {
	
	@RequestMapping("/hello")
	public String m() {
		return "hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjectDockerApplication.class, args);
	}

}
