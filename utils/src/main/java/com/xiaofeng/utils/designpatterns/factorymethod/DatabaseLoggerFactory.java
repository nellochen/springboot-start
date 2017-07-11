package com.xiaofeng.utils.designpatterns.factorymethod;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/11
 * @email chenxf84@gmail.com
 */


public class DatabaseLoggerFactory extends ALoggerFactory implements ILoggerFactory {

    public ILogger createLogger() {
        //连接数据库，代码省略
        //创建数据库日志记录器对象
        ILogger logger = new DatabaseLogger();
        //初始化数据库日志记录器，代码省略
        return logger;
    }

    public ILogger createLogger(String args) {
        //使用参数args作为连接字符串来连接数据库，代码省略
        ILogger logger = new DatabaseLogger();
        //初始化数据库日志记录器，代码省略
        return logger;
    }

    public ILogger createLogger(Object obj) {
        //使用封装在参数obj中的连接字符串来连接数据库，代码省略
        ILogger logger = new DatabaseLogger();
        //使用封装在参数obj中的数据来初始化数据库日志记录器，代码省略
        return logger;
    }
}
