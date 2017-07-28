package com.xiaofeng.utils.designpatterns.command;

import java.io.Serializable;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/25
 * @email chenxf84@gmail.com
 */


public class ConfigOperator implements Serializable {
    public void insert(String args) {
        System.out.println("增加新节点：" + args);
    }

    public void modify(String args) {
        System.out.println("修改节点：" + args);
    }

    public void delete(String args) {
        System.out.println("删除节点：" + args);
    }
}
