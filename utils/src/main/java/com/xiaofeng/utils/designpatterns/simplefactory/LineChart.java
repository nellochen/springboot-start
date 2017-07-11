package com.xiaofeng.utils.designpatterns.simplefactory;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/10
 * @email chenxf84@gmail.com
 */


public class LineChart implements IChart {

    public LineChart() {
        System.out.println("创建折线图");
    }

    @Override
    public void display() {
        System.out.println("现实折线图");
    }
}
