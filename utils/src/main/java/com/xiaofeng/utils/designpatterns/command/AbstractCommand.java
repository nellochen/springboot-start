package com.xiaofeng.utils.designpatterns.command;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/21
 * @email chenxf84@gmail.com
 */


abstract public class AbstractCommand {
    public abstract int execute(int value); //声明命令执行方法execute()

    public abstract int undo(); //声明撤销方法undo()
}
