package com.java.selfdeveloped.spring.azure.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringIntegrationAzureAppApplication {

	@GetMapping("/message")
	public String message(){
		return "Congrats ! your application deployed successfully in Azure Platform. !";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationAzureAppApplication.class, args);
	}

}
