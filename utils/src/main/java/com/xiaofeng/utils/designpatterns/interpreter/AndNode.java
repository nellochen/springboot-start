package com.xiaofeng.utils.designpatterns.interpreter;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/28
 * @email chenxf84@gmail.com
 */


public class AndNode extends AbstractNode {
    private AbstractNode left; //And的左表达式
    private AbstractNode right; //And的右表达式

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    //And表达式解释操作
    public String interpret() {
        return left.interpret() + "再" + right.interpret();
    }
}
