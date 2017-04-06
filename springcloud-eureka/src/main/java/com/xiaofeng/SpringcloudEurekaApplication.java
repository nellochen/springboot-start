package com.xiaofeng;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaApplication {

    public static void main(String[] args) {

//		SpringApplication.run(SpringcloudEurekaApplication.class, args);
        new SpringApplicationBuilder(SpringcloudEurekaApplication.class).web(true).run(args);
    }
}
