package com.therealdanvega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan( basePackages = {"domain"} )
public class EntityScanDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntityScanDemoApplication.class, args);
	}
}
