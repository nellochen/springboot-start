package com.xiaofeng.utils.designpatterns.simplefactory;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/10
 * @email chenxf84@gmail.com
 */


public class ChartFactory {

    //静态工厂方法
    public static IChart getChart(String type){
        IChart chart = null;
        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图！");
        }
        else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("初始化设置饼状图！");
        }
        else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
            System.out.println("初始化设置折线图！");
        }
        return chart;
    }
}
