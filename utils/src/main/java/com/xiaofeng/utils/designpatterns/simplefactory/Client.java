package com.xiaofeng.utils.designpatterns.simplefactory;

import com.xiaofeng.utils.common.XMLUtil;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/10
 * @email chenxf84@gmail.com
 */

//在以下情况下可以考虑使用简单工厂模式：
//(1) 工厂类负责创建的对象比较少，由于创建的对象较少，不会造成工厂方法中的业务逻辑太过复杂。
//(2) 客户端只知道传入工厂类的参数，对于如何创建对象并不关心。
public class Client {
    public static void main(String[] args) {
        IChart chart;
//        String type = "histogram";
        String type = XMLUtil.getChartType();
        chart = ChartFactory.getChart(type);
        chart.display();
    }
}
