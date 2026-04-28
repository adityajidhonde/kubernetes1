package com.tch.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/api/data")
	public Map<String, String> getData() {
		Map<String, String> response = new HashMap<>();
		response.put("service", "Java Spring Boot Backend");
		response.put("status", "Operational");
		response.put("role", "Data Processing");
		return response;
	}
}