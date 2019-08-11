package com.jdriven.gateway.stateful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.discovery.GatewayDiscoveryClientAutoConfiguration;

@SpringBootApplication(exclude = GatewayDiscoveryClientAutoConfiguration.class)
public class GatewayApplication {
	public static void main(String... args) {
		SpringApplication.run(GatewayApplication.class);
	}
}