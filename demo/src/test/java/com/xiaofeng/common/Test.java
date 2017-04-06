package com.xiaofeng.common;

import java.util.LinkedList;

/**
 * Created by Chen Xiaofeng on 2017/03/22.
 */
public class Test {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add("A");
        list.add("B");
        String s=(String)list.get(1);
        System.out.println(s);

    }
}
