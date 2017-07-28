package com.xiaofeng.utils.designpatterns.command;

import java.io.Serializable;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/25
 * @email chenxf84@gmail.com
 */


abstract public class Commander implements Serializable {
    protected String name; //命令名称
    protected String args; //命令参数
    protected ConfigOperator configOperator; //维持对接收者对象的引用

    public Commander(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConfigOperator(ConfigOperator configOperator) {
        this.configOperator = configOperator;
    }

    //声明两个抽象的执行方法execute()
    public abstract void execute(String args);

    public abstract void execute();
}
