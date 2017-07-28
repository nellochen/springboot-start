package com.xiaofeng.utils.designpatterns.interpreter;

import java.util.HashMap;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/28
 * @email chenxf84@gmail.com
 */


public class Context {
    private HashMap map = new HashMap();

    public void assign(String key, String value) {
        //往环境类中设值
    }

    public String lookup(String key) {
        //获取存储在环境类中的值
        return key;
    }
}
