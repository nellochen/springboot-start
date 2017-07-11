package com.xiaofeng.utils.designpatterns.simplefactory;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/10
 * @email chenxf84@gmail.com
 */


public class HistogramChart implements IChart {

    public HistogramChart() {
        System.out.println("创建柱状图");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}
