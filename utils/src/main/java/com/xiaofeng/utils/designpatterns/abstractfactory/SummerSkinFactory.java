package com.xiaofeng.utils.designpatterns.abstractfactory;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/12
 * @email chenxf84@gmail.com
 */


public class SummerSkinFactory implements ISkinFactory {
    @Override
    public IButton createButton() {
        return new SummerButton();
    }

    @Override
    public ITextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public IComboBox createComboBox() {
        return new SummerComboBox();
    }
}
