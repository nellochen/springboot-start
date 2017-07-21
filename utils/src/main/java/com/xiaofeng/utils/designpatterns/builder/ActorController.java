package com.xiaofeng.utils.designpatterns.builder;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/17
 * @email chenxf84@gmail.com
 */


public class ActorController {

    //逐步构建复杂产品对象
    public Actor construct(ActorBuilder ab) {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        //当在客户端代码中指定具体建造者类型并通过指挥者来实现产品的逐步构建时，将调用钩子方法isBareheaded()来判断游戏角色是否有头发，如果isBareheaded()方法返回true，即没有头发，则跳过构建发型的方法buildHairstyle()；否则将执行buildHairstyle()方法。通过引入钩子方法，我们可以在Director中对复杂产品的构建进行精细的控制，不仅指定buildPartX()方法的执行顺序，还可以控制是否需要执行某个buildPartX()方法。
        if (!ab.isBareheaded()) {
            ab.buildHairstyle();
        }
        actor = ab.createActor();
        return actor;
    }
}
