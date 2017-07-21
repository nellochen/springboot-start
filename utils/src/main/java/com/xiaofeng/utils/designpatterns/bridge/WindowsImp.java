package com.xiaofeng.utils.designpatterns.bridge;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/19
 * @email chenxf84@gmail.com
 */


public class WindowsImp implements IImageImp {
    public void doPaint(Matrix m) {
        //调用Windows系统的绘制函数绘制像素矩阵
        System.out.print("在Windows操作系统中显示图像：");
    }
}
