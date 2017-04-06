package com.xiaofeng;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudEurekaServiceApplication {

	public static void main(String[] args) {

//		SpringApplication.run(SpringcloudEurekaServiceApplication.class, args);
		new SpringApplicationBuilder(SpringcloudEurekaServiceApplication.class).web(true).run(args);
	}
}
