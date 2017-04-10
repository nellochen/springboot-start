package com.xiaofeng.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/04/10
 * @email chenxf84@gmail.com
 */

@FeignClient(value = "springcloud-eureka-service", fallback = ComputerClientServiceHystrix.class)
public interface ComputeClientService {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
