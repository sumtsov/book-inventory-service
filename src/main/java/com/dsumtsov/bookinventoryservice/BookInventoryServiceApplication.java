package com.dsumtsov.bookinventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@EnableScheduling
@EnableFeignClients
@SpringBootApplication
@ConfigurationPropertiesScan
public class BookInventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookInventoryServiceApplication.class, args);
	}

}
