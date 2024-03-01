package com.practice.jenkincicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinCiCdApplication {

	@GetMapping("/greetings/{name}")
	public String greetings(@PathVariable String name) {
		//User1
		//User2
		name= name.split(" ")[0];
		return "Hello " + name + " Congratulations you have successfully completed Jenkins CI/CD demo !";
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinCiCdApplication.class, args);
	}

}

