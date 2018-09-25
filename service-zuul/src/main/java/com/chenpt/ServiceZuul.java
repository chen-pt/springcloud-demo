package com.chenpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Zuul的主要功能是路由转发和过滤器
 */

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ServiceZuul {

	public static void main(String[] args) {
		SpringApplication.run(ServiceZuul.class, args);
	}
}
