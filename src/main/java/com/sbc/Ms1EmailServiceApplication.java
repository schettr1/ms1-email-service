package com.sbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ms1EmailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms1EmailServiceApplication.class, args);
	}

}
