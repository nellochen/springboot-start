package com.xiaofeng.utils.designpatterns.proxy;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/21
 * @email chenxf84@gmail.com
 */


public class AccessValidator {
    //模拟实现登录验证
    public boolean Validate(String userId) {
        System.out.println("在数据库中验证用户[" + userId + "]是否是合法用户？");
        if (userId.equals("杨过")) {
            System.out.println("登录成功:" + userId);
            return true;
        } else {
            System.out.println("登录失败:" + userId);
            return false;
        }
    }
}
