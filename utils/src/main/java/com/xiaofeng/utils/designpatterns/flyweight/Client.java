package com.xiaofeng.utils.designpatterns.flyweight;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/20
 * @email chenxf84@gmail.com
 */

//在单纯享元模式中，所有的具体享元类都是可以共享的，不存在非共享具体享元类。
//将一些单纯享元对象使用组合模式加以组合，还可以形成复合享元对象，这样的复合享元对象本身不能共享，但是它们可以分解成单纯享元对象，而后者则可以共享。
//    享元模式通常需要和其他模式一起联用，几种常见的联用方式如下：
//            (1)在享元模式的享元工厂类中通常提供一个静态的工厂方法用于返回享元对象，使用简单工厂模式来生成享元对象。
//            (2)在一个系统中，通常只有唯一一个享元工厂，因此可以使用单例模式进行享元工厂类的设计。
//            (3)享元模式可以结合组合模式形成复合享元模式，统一对多个享元对象设置外部状态。
//            2.享元模式与String类
//            JDK类库中的String类使用了享元模式
//关于Java String类这种在修改享元对象时，先将原有对象复制一份，然后在新对象上再实施修改操作的机制称为“Copy On Write”

//当系统中存在大量相同或者相似的对象时，享元模式是一种较好的解决方案，它通过共享技术实现相同或相似的细粒度对象的复用，从而节约了内存空间，提高了系统性能。相比其他结构型设计模式，享元模式的使用频率并不算太高，但是作为一种以“节约内存，提高性能”为出发点的设计模式，它在软件开发中还是得到了一定程度的应用。
//        1.主要优点
//        享元模式的主要优点如下：
//        (1) 可以极大减少内存中对象的数量，使得相同或相似对象在内存中只保存一份，从而可以节约系统资源，提高系统性能。
//        (2) 享元模式的外部状态相对独立，而且不会影响其内部状态，从而使得享元对象可以在不同的环境中被共享。
//        2.主要缺点
//        享元模式的主要缺点如下：
//        (1) 享元模式使得系统变得复杂，需要分离出内部状态和外部状态，这使得程序的逻辑复杂化。
//        (2) 为了使对象可以共享，享元模式需要将享元对象的部分状态外部化，而读取外部状态将使得运行时间变长。
//        3.适用场景
//        在以下情况下可以考虑使用享元模式：
//        (1) 一个系统有大量相同或者相似的对象，造成内存的大量耗费。
//        (2) 对象的大部分状态都可以外部化，可以将这些外部状态传入对象中。
//        (3) 在使用享元模式时需要维护一个存储享元对象的享元池，而这需要耗费一定的系统资源，因此，应当在需要多次重复使用享元对象时才值得使用享元模式。
public class Client {
    public static void main(String args[]) {
        IgoChessman black1, black2, black3, white1, white2;
        IgoChessmanFactory factory;

        //获取享元工厂对象
        factory = IgoChessmanFactory.getInstance();

        //通过享元工厂获取三颗黑子
        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");
        black3 = factory.getIgoChessman("b");
        System.out.println("判断两颗黑子是否相同：" + (black1 == black2));

        //通过享元工厂获取两颗白子
        white1 = factory.getIgoChessman("w");
        white2 = factory.getIgoChessman("w");
        System.out.println("判断两颗白子是否相同：" + (white1 == white2));

        //显示棋子
        black1.display(new Coordinates(1, 2));
        black2.display(new Coordinates(3, 4));
        black3.display(new Coordinates(1, 3));
        white1.display(new Coordinates(2, 5));
        white2.display(new Coordinates(2, 4));
    }
}
