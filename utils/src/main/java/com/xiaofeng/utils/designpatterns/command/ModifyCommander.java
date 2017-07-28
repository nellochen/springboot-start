package com.xiaofeng.utils.designpatterns.command;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/25
 * @email chenxf84@gmail.com
 */


public class ModifyCommander extends Commander {
    public ModifyCommander(String name) {
        super(name);
    }

    public void execute(String args) {
        this.args = args;
        configOperator.modify(args);
    }

    public void execute() {
        configOperator.modify(this.args);
    }
}
