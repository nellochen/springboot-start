package com.xiaofeng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@ComponentScan(basePackages={"com.xiaofeng"})
@EnableAutoConfiguration
//@EnableJpaRepositories(basePackages = "com.xiaofeng.repository")
//@EnableAutoConfiguration (exclude = {  DataSourceAutoConfiguration.class })
@EnableAsync
@RestController
@EnableCaching
public class FinanceApplication {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String testLogLevel() {
		logger.debug("Logger Level ：DEBUG");
		logger.info("Logger Level ：INFO");
		logger.error("Logger Level ：ERROR");
		return "";
	}

	public static void main(String[] args) {
		SpringApplication.run(FinanceApplication.class, args);
	}
}
