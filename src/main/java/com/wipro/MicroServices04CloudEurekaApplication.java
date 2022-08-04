package com.wipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServices04CloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServices04CloudEurekaApplication.class, args);
	}

}
