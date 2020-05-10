package com.paydaybank.ms.communication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PbdMsEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(PbdMsEmailApplication.class, args);
	}

}
