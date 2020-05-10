package com.paydaybank.ms.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PbdMsCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PbdMsCustomerApplication.class, args);
	}

}
