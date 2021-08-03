package com.swapn.dockerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerExampleApplication.class, args);
	}

}

@RestController
class HelloWorldController{
	@GetMapping("/hello")
	public String helloWorld() {
		return "hii swapnil how is docker experience";
	}
}