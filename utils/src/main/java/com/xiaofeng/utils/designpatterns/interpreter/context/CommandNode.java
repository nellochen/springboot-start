package com.xiaofeng.utils.designpatterns.interpreter.context;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/28
 * @email chenxf84@gmail.com
 */


public class CommandNode extends Node {
    private Node node;

    public void interpret(Context context) {
        //处理LOOP循环命令
        if (context.currentToken().equals("LOOP")) {
            node = new LoopCommandNode();
            node.interpret(context);
        }
        //处理其他基本命令
        else {
            node = new PrimitiveCommandNode();
            node.interpret(context);
        }
    }

    public void execute() {
        node.execute();
    }
}
