package com.xiaofeng.utils.designpatterns.simplefactory;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/10
 * @email chenxf84@gmail.com
 */


public class Chart {
    private String type; //图表类型

    public Chart(Object[][] data, String type) {
        this.type = type;
        if (type.equalsIgnoreCase("histogram")) {
            //初始化柱状图
        } else if (type.equalsIgnoreCase("pie")) {
            //初始化饼状图
        } else if (type.equalsIgnoreCase("line")) {
            //初始化折线图
        }
    }

    public void display() {
        if (this.type.equalsIgnoreCase("histogram")) {
            //显示柱状图
        } else if (this.type.equalsIgnoreCase("pie")) {
            //显示饼状图
        } else if (this.type.equalsIgnoreCase("line")) {
            //显示折线图
        }
    }
}
