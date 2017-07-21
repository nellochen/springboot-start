package com.xiaofeng.utils.designpatterns.facade;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/20
 * @email chenxf84@gmail.com
 */


public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Memory load");
    }
}
