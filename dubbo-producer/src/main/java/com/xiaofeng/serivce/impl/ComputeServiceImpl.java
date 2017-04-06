package com.xiaofeng.serivce.impl;

import com.xiaofeng.serivce.ComputeService;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/04/05
 * @email chenxf84@gmail.com
 */


public class ComputeServiceImpl implements ComputeService {

    @Override
    public Integer add(int a, int b) {
        return a + b;
    }
}
