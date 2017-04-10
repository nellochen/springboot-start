package com.xiaofeng.web;

import com.xiaofeng.service.ComputeClientService;
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

    @Autowired
    private ComputeClientService computeClientService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        Integer r = computeClientService.add(10, 20);
        logger.info("Ribbon 测试");
        return r;
    }
}
