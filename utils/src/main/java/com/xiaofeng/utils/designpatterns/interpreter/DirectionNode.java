package com.xiaofeng.utils.designpatterns.interpreter;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/28
 * @email chenxf84@gmail.com
 */

//方向解释：终结符表达式
public class DirectionNode extends AbstractNode {
    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    //方向表达式的解释操作
    public String interpret() {
        if (direction.equalsIgnoreCase("up")) {
            return "向上";
        } else if (direction.equalsIgnoreCase("down")) {
            return "向下";
        } else if (direction.equalsIgnoreCase("left")) {
            return "向左";
        } else if (direction.equalsIgnoreCase("right")) {
            return "向右";
        } else {
            return "无效指令";
        }
    }
}
