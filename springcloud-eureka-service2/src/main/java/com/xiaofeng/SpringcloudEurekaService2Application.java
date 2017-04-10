package com.xiaofeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudEurekaService2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaService2Application.class, args);
	}
}
