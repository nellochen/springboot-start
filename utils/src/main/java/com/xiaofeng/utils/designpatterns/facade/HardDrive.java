package com.xiaofeng.utils.designpatterns.facade;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/20
 * @email chenxf84@gmail.com
 */


public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("HardDrive read");
        return null;
    }
}
