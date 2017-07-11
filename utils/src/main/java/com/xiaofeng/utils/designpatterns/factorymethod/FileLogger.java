package com.xiaofeng.utils.designpatterns.factorymethod;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/11
 * @email chenxf84@gmail.com
 */


public class FileLogger implements ILogger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
