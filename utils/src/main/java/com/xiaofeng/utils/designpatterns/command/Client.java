package com.xiaofeng.utils.designpatterns.command;

import com.xiaofeng.utils.common.XMLUtil;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/21
 * @email chenxf84@gmail.com
 */

//命令模式是一种使用频率非常高的设计模式，它可以将请求发送者与接收者解耦，请求发送者通过命令对象来间接引用请求接收者，使得系统具有更好的灵活性和可扩展性。在基于GUI的软件开发，无论是在电脑桌面应用还是在移动应用中，命令模式都得到了广泛的应用。
//        主要优点
//        命令模式的主要优点如下：
//        (1) 降低系统的耦合度。由于请求者与接收者之间不存在直接引用，因此请求者与接收者之间实现完全解耦，相同的请求者可以对应不同的接收者，同样，相同的接收者也可以供不同的请求者使用，两者之间具有良好的独立性。
//        (2) 新的命令可以很容易地加入到系统中。由于增加新的具体命令类不会影响到其他类，因此增加新的具体命令类很容易，无须修改原有系统源代码，甚至客户类代码，满足“开闭原则”的要求。
//        (3) 可以比较容易地设计一个命令队列或宏命令（组合命令）。
//        (4) 为请求的撤销(Undo)和恢复(Redo)操作提供了一种设计和实现方案。
//        主要缺点
//        命令模式的主要缺点如下：
//        使用命令模式可能会导致某些系统有过多的具体命令类。因为针对每一个对请求接收者的调用操作都需要设计一个具体命令类，因此在某些系统中可能需要提供大量的具体命令类，这将影响命令模式的使用。
//        适用场景
//        在以下情况下可以考虑使用命令模式：
//        (1) 系统需要将请求调用者和请求接收者解耦，使得调用者和接收者不直接交互。请求调用者无须知道接收者的存在，也无须知道接收者是谁，接收者也无须关心何时被调用。
//        (2) 系统需要在不同的时间指定请求、将请求排队和执行请求。一个命令对象和请求的初始调用者可以有不同的生命期，换言之，最初的请求发出者可能已经不在了，而命令对象本身仍然是活动的，可以通过该命令对象去调用请求接收者，而无须关心请求调用者的存在性，可以通过请求日志文件等机制来具体实现。
//        (3) 系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作。
//        (4) 系统需要将一组操作组合在一起形成宏命令。
public class Client {
    public static void main(String args[]) {
        FBSettingWindow fbsw = new FBSettingWindow("功能键设置");

        FunctionButton fb1,fb2;
        fb1 = new FunctionButton("功能键1");
        fb2 = new FunctionButton("功能键2");

        Command command1,command2;
        //通过读取配置文件和反射生成具体命令对象
        command1 = (Command) XMLUtil.getBean("config-command.xml",0);
        command2 = (Command)XMLUtil.getBean("config-command.xml", 1);

        //将命令对象注入功能键
        fb1.setCommand(command1);
        fb2.setCommand(command2);

        fbsw.addFunctionButton(fb1);
        fbsw.addFunctionButton(fb2);
        fbsw.display();

        //调用功能键的业务方法
        fb1.onClick();
        fb2.onClick();
    }
}
