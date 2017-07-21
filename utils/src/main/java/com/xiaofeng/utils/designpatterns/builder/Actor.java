package com.xiaofeng.utils.designpatterns.builder;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/17
 * @email chenxf84@gmail.com
 */


public class Actor {

    private String type; //角色类型
    private String sex; //性别
    private String face; //脸型
    private String costume; //服装
    private String hairstyle; //发型

    public String getType() {
        return (this.type);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return (this.sex);
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return (this.face);
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCostume() {
        return (this.costume);
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getHairstyle() {
        return (this.hairstyle);
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }
}
