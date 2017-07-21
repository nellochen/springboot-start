package com.xiaofeng.utils.designpatterns.builder;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/17
 * @email chenxf84@gmail.com
 */


public class DevilBuilder extends ActorBuilder {
    public void buildType() {
        actor.setType("恶魔");
    }

    public void buildSex() {
        actor.setSex("妖");
    }

    public void buildFace() {
        actor.setFace("丑陋");
    }

    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }

    //覆盖钩子方法
    public boolean isBareheaded() {
        return true;
    }
}
