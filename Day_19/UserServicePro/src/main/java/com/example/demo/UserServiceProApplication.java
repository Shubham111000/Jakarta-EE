package com.example.demo;

import org.springframework.boot.SpringApplication;import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages="com.example.*")
@EntityScan(basePackages="com.example.*")
public class UserServiceProApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceProApplication.class, args);
		
	}
	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}

}
