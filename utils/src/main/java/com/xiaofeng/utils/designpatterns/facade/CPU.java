package com.xiaofeng.utils.designpatterns.facade;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/20
 * @email chenxf84@gmail.com
 */


public class CPU {
    public void freeze() {
        System.out.println("freeze");
    }

    public void jump(long position) {
        System.out.println("jump");
    }

    public void execute() {
        System.out.println("execute");
    }
}
