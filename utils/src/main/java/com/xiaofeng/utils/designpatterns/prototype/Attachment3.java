package com.xiaofeng.utils.designpatterns.prototype;

import java.io.Serializable;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/13
 * @email chenxf84@gmail.com
 */


public class Attachment3 implements Serializable{
    private String name; //附件名

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("下载附件，文件名为" + name);
    }
}
