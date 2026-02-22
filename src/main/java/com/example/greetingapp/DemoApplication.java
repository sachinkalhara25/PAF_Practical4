
package com.example.greetingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// 1. Basic /greet endpoint
	@GetMapping("/greet")
	public String greetDefault() {
		return "Welcome to Spring Boot!";
	}

	// 2 & 3. /greet/{name} with optional query parameter ?message=
	@GetMapping("/greet/{name}")
	public String greetWithName(
			@PathVariable String name,
			@RequestParam(required = false) String message) {

		if (message != null && !message.isEmpty()) {
			return "Hello " + name + "! " + message;
		} else {
			return "Hello " + name + "! Welcome to Spring Boot!";
		}
	}

	// Combined /hello endpoint with optional ?name= and ?message=
	@GetMapping("/hello")
	public String hello(
			@RequestParam(required = false) String name,
			@RequestParam(required = false) String message) {

		if (name != null && !name.isEmpty()) {
			if (message != null && !message.isEmpty()) {
				return "Hello " + name + "! " + message;
			} else {
				return "Hello " + name + "!";
			}
		} else {
			return "Hello World!";
		}
	}
}