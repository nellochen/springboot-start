package com.xiaofeng.utils.designpatterns.command;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/25
 * @email chenxf84@gmail.com
 */


public class ClientCommander {
    public static void main(String args[]) {
        ConfigSettingWindow csw = new ConfigSettingWindow(); //定义请求发送者
        Commander command; //定义命令对象
        ConfigOperator co = new ConfigOperator(); //定义请求接收者

        //四次对配置文件的更改
        command = new InsertCommander("增加");
        command.setConfigOperator(co);
        csw.setCommand(command);
        csw.call("网站首页");

        command = new InsertCommander("增加");
        command.setConfigOperator(co);
        csw.setCommand(command);
        csw.call("端口号");

        command = new ModifyCommander("修改");
        command.setConfigOperator(co);
        csw.setCommand(command);
        csw.call("网站首页");

        command = new ModifyCommander("修改");
        command.setConfigOperator(co);
        csw.setCommand(command);
        csw.call("端口号");

        System.out.println("----------------------------");
        System.out.println("保存配置");
        csw.save();

        System.out.println("----------------------------");
        System.out.println("恢复配置");
        System.out.println("----------------------------");
        csw.recover();
    }
}
