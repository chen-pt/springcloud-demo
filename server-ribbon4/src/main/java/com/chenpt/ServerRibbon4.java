package com.chenpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix        //开启断路器
public class ServerRibbon4 {

	public static void main(String[] args) {
		SpringApplication.run(ServerRibbon4.class, args);
	}

	@Bean
	@LoadBalanced//开启负载均衡
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
