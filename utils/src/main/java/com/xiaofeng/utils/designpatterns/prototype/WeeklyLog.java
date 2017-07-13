package com.xiaofeng.utils.designpatterns.prototype;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/13
 * @email chenxf84@gmail.com
 */


public class WeeklyLog implements Cloneable {

    private String name;
    private String date;
    private String content;

    public String getName() {
        return (this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return (this.date);
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return (this.content);
    }

    public void setContent(String content) {
        this.content = content;
    }

    //克隆方法clone()，此处使用Java语言提供的克隆机制
    public WeeklyLog clone() {
        Object obj = null;
        try {
            obj = super.clone();
            return (WeeklyLog) obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
            return null;
        }
    }
}
