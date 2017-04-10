package com.xiaofeng.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/04/10
 * @email chenxf84@gmail.com
 */

@Component
public class ComputerClientServiceHystrix implements ComputeClientService {

    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
