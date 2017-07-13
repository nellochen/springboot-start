package com.xiaofeng.utils.designpatterns.abstractfactory;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/12
 * @email chenxf84@gmail.com
 */


public class SummerTextField implements ITextField {
    @Override
    public void display() {
        System.out.println("红色文本框");
    }
}
