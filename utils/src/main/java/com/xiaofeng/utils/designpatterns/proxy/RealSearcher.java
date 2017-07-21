package com.xiaofeng.utils.designpatterns.proxy;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/21
 * @email chenxf84@gmail.com
 */


public class RealSearcher implements ISearcher {
    //模拟查询商务信息
    public String DoSearch(String userId, String keyword) {
        System.out.println("用户[" + userId + "]使用关键词[" + keyword + "]查询商务信息！");
        return "返回具体内容";
    }
}
