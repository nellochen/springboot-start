package com.xiaofeng.utils.designpatterns.abstractfactory;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/12
 * @email chenxf84@gmail.com
 */


public class SpringButton implements IButton {
    @Override
    public void display() {
        System.out.println("绿色按钮");
    }
}
