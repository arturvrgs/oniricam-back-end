package com.oniricam.oniricam_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class OniricamBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OniricamBackendApplication.class, args);
	}

}
