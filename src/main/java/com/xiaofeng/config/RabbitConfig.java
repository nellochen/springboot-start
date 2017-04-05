package com.xiaofeng.config;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/04/01
 * @email chenxf84@gmail.com
 */

@Configuration
public class RabbitConfig extends RabbitAutoConfiguration{

    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }

}
