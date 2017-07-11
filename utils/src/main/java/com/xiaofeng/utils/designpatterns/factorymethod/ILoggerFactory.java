package com.xiaofeng.utils.designpatterns.factorymethod;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/11
 * @email chenxf84@gmail.com
 */

//工厂方法模式(Factory Method Pattern)：定义一个用于创建对象的接口，让子类决定将哪一个类实例化。工厂方法模式让一个类的实例化延迟到其子类。工厂方法模式又简称为工厂模式(Factory Pattern)，又可称作虚拟构造器模式(Virtual Constructor Pattern)或多态工厂模式(Polymorphic Factory Pattern)。工厂方法模式是一种类创建型模式。
public interface ILoggerFactory {
    public ILogger createLogger();
    public ILogger createLogger(String args);
    public ILogger createLogger(Object obj);
}
