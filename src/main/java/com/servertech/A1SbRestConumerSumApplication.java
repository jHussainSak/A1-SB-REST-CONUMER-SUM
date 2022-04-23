package com.servertech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class A1SbRestConumerSumApplication {

	public static void main(String[] args) {
		SpringApplication.run(A1SbRestConumerSumApplication.class, args);
	}//EOM

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
		
	}
}//EOC
