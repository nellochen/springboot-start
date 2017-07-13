package com.xiaofeng.utils.designpatterns.prototype;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/13
 * @email chenxf84@gmail.com
 */

//在浅克隆中，如果原型对象的成员变量是值类型，将复制一份给克隆对象；如果原型对象的成员变量是引用类型，则将引用对象的地址复制一份给克隆对象，也就是说原型对象和克隆对象的成员变量指向相同的内存地址。简单来说，在浅克隆中，当对象被复制时只复制它本身和其中包含的值类型的成员变量，而引用类型的成员对象并没有复制，在Java语言中，通过覆盖Object类的clone()方法可以实现浅克隆。
public class Client2 {
    public static void main(String args[]) {
        WeeklyLog2 log_previous, log_new;
        log_previous = new WeeklyLog2(); //创建原型对象
        Attachment attachment = new Attachment(); //创建附件对象
        log_previous.setAttachment(attachment);  //将附件添加到周报中
        log_new = log_previous.clone(); //调用克隆方法创建克隆对象
        //比较周报
        System.out.println("周报是否相同？ " + (log_previous == log_new));
        //比较附件
        System.out.println("附件是否相同？ " + (log_previous.getAttachment() == log_new.getAttachment()));
    }
}
