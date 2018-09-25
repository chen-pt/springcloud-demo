package com.chenpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient//激活eureka的自动化配置
@EnableEurekaClient
public class Client1 {

	public static void main(String[] args) {
		SpringApplication.run(Client1.class, args);
	}
}
