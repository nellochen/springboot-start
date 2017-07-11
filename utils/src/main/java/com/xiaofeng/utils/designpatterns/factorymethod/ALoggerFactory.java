package com.xiaofeng.utils.designpatterns.factorymethod;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/11
 * @email chenxf84@gmail.com
 */


abstract public class ALoggerFactory {
    //在工厂类中直接调用日志记录器类的业务方法writeLog()
    public void writeLog() {
        ILogger logger = this.createLogger();
        logger.writeLog();
    }

    public abstract ILogger createLogger();
}
