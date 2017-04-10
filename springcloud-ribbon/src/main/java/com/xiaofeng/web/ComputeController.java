package com.xiaofeng.web;

import com.xiaofeng.service.ComputerService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/04/06
 * @email chenxf84@gmail.com
 */

@RestController
public class ComputeController {

    private final Logger logger = Logger.getLogger(getClass());

    //    @Autowired
//    private RestTemplate restTemplate;
    @Autowired
    private ComputerService computerService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
//        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("Ribbon测试");
        return computerService.addService();
//        return restTemplate.getForEntity("http://springcloud-eureka-service/add?a=10&b=20", String.class).getBody();
    }
}
