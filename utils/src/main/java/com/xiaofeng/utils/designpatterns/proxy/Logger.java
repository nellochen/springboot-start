package com.xiaofeng.utils.designpatterns.proxy;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/21
 * @email chenxf84@gmail.com
 */


public class Logger {
    //模拟实现日志记录
    public void Log(String userId) {
        System.out.println("更新数据库，用户[" + userId + "]查询次数加1");
    }
}
