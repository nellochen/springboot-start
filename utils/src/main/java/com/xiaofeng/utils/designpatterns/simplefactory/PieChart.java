package com.xiaofeng.utils.designpatterns.simplefactory;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/10
 * @email chenxf84@gmail.com
 */


public class PieChart implements IChart {
    public PieChart() {
        System.out.println("创建饼状图");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图");
    }
}
