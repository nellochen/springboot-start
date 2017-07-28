package com.xiaofeng.utils.designpatterns.interpreter;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/28
 * @email chenxf84@gmail.com
 */


abstract public class AbstractExpression {
    public  abstract void interpret(Context ctx);
}
