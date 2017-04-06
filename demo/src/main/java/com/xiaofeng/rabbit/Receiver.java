package com.xiaofeng.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/04/01
 * @email chenxf84@gmail.com
 */

@Component
@RabbitListener(queues = "hello")
public class Receiver {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver : " + hello);
    }
}
