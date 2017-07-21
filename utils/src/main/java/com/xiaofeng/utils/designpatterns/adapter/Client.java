package com.xiaofeng.utils.designpatterns.adapter;

import com.xiaofeng.utils.common.XMLUtil;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/18
 * @email chenxf84@gmail.com
 */

//适配器模式将现有接口转化为客户类所期望的接口，实现了对现有类的复用，它是一种使用频率非常高的设计模式，在软件开发中得以广泛应用，在Spring等开源框架、驱动程序设计（如JDBC中的数据库驱动程序）中也使用了适配器模式。
//        主要优点
//        无论是对象适配器模式还是类适配器模式都具有如下优点：
//        (1) 将目标类和适配者类解耦，通过引入一个适配器类来重用现有的适配者类，无须修改原有结构。
//        (2) 增加了类的透明性和复用性，将具体的业务实现过程封装在适配者类中，对于客户端类而言是透明的，而且提高了适配者的复用性，同一个适配者类可以在多个不同的系统中复用。
//        (3) 灵活性和扩展性都非常好，通过使用配置文件，可以很方便地更换适配器，也可以在不修改原有代码的基础上增加新的适配器类，完全符合“开闭原则”。
//        具体来说，类适配器模式还有如下优点：
//        由于适配器类是适配者类的子类，因此可以在适配器类中置换一些适配者的方法，使得适配器的灵活性更强。
//        对象适配器模式还有如下优点：
//        (1) 一个对象适配器可以把多个不同的适配者适配到同一个目标；
//        (2) 可以适配一个适配者的子类，由于适配器和适配者之间是关联关系，根据“里氏代换原则”，适配者的子类也可通过该适配器进行适配。
//        主要缺点
//        类适配器模式的缺点如下：
//        (1) 对于Java、C#等不支持多重类继承的语言，一次最多只能适配一个适配者类，不能同时适配多个适配者；
//        (2) 适配者类不能为最终类，如在Java中不能为final类，C#中不能为sealed类；
//        (3) 在Java、C#等语言中，类适配器模式中的目标抽象类只能为接口，不能为类，其使用有一定的局限性。
//        对象适配器模式的缺点如下：
//        与类适配器模式相比，要在适配器中置换适配者类的某些方法比较麻烦。如果一定要置换掉适配者类的一个或多个方法，可以先做一个适配者类的子类，将适配者类的方法置换掉，然后再把适配者类的子类当做真正的适配者进行适配，实现过程较为复杂。
//        适用场景
//        在以下情况下可以考虑使用适配器模式：
//        (1) 系统需要使用一些现有的类，而这些类的接口（如方法名）不符合系统的需要，甚至没有这些类的源代码。
//        (2) 想创建一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作。
public class Client {
    public static void main(String args[]) {
        IScoreOperation operation;  //针对抽象目标接口编程
        operation = (IScoreOperation) XMLUtil.getBean("config-adapter.xml"); //读取配置文件，反射生成对象
        int scores[] = {84, 76, 50, 69, 90, 91, 88, 96}; //定义成绩数组
        int result[];
        int score;

        System.out.println("成绩排序结果：");
        result = operation.sort(scores);

        //遍历输出成绩
        for (int i : scores) {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("查找成绩90：");
        score = operation.search(result, 90);
        if (score != -1) {
            System.out.println("找到成绩90。");
        } else {
            System.out.println("没有找到成绩90。");
        }

        System.out.println("查找成绩92：");
        score = operation.search(result, 92);
        if (score != -1) {
            System.out.println("找到成绩92。");
        } else {
            System.out.println("没有找到成绩92。");
        }
    }
}
