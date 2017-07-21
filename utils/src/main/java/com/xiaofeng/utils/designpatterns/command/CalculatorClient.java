package com.xiaofeng.utils.designpatterns.command;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/21
 * @email chenxf84@gmail.com
 */

//在命令模式中，我们可以通过调用一个命令对象的execute()方法来实现对请求的处理，如果需要撤销(Undo)请求，可通过在命令类中增加一个逆向操作来实现。
//扩展
//除了通过一个逆向操作来实现撤销(Undo)外，还可以通过保存对象的历史状态来实现撤销，后者可使用备忘录模式(Memento Pattern)来实现。
public class CalculatorClient {
    public static void main(String args[]) {
        CalculatorForm form = new CalculatorForm();
        AbstractCommand command;
        command = new ConcreteCommand();
        form.setCommand(command); //向发送者注入命令对象

        form.compute(10);
        form.compute(5);
        form.compute(10);
        form.undo();
        form.undo();
    }
}
