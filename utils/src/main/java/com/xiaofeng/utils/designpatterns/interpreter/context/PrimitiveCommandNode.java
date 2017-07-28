package com.xiaofeng.utils.designpatterns.interpreter.context;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/28
 * @email chenxf84@gmail.com
 */


public class PrimitiveCommandNode extends Node {
    private String name;
    private String text;

    //解释基本命令
    public void interpret(Context context) {
        name = context.currentToken();
        context.skipToken(name);
        if (!name.equals("PRINT") && !name.equals("BREAK") && !name.equals("SPACE")) {
            System.err.println("非法命令！");
        }
        if (name.equals("PRINT")) {
            text = context.currentToken();
            context.nextToken();
        }
    }

    public void execute() {
        if (name.equals("PRINT"))
            System.out.print(text);
        else if (name.equals("SPACE"))
            System.out.print(" ");
        else if (name.equals("BREAK"))
            System.out.println();
    }
}
