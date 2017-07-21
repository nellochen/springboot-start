package com.xiaofeng.utils.designpatterns.bridge;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/19
 * @email chenxf84@gmail.com
 */


public class GIFImage extends Image {
    public void parseFile(String fileName) {
        //模拟解析JPG文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为GIF。");
    }
}
