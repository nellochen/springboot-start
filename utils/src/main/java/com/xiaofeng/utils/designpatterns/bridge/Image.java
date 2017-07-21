package com.xiaofeng.utils.designpatterns.bridge;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/19
 * @email chenxf84@gmail.com
 */


abstract public class Image {
    protected IImageImp imp;

    public void setImageImp(IImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
