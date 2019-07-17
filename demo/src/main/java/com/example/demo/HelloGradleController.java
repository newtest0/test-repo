package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloGradleController {

	@GetMapping
	public String helloGradle() {

		System.out.println("Hello");
		

		System.out.println("Hello");
		
		String name = "my namne";
		
		System.out.println(name);

		return "Hello Gradle!";
	}

}
