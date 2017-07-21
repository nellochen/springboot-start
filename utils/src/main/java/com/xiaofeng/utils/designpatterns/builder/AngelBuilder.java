package com.xiaofeng.utils.designpatterns.builder;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/17
 * @email chenxf84@gmail.com
 */


public class AngelBuilder extends ActorBuilder{
    public void buildType() {
        actor.setType("天使");
    }

    public void buildSex() {
        actor.setSex("女");
    }

    public void buildFace() {
        actor.setFace("漂亮");
    }

    public void buildCostume() {
        actor.setCostume("白裙");
    }

    public void buildHairstyle() {
        actor.setHairstyle("披肩长发");
    }
}
