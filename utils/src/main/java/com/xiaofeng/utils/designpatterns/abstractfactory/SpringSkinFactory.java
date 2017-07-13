package com.xiaofeng.utils.designpatterns.abstractfactory;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/12
 * @email chenxf84@gmail.com
 */


public class SpringSkinFactory implements ISkinFactory {
    @Override
    public IButton createButton() {
        return new SpringButton();
    }

    @Override
    public ITextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public IComboBox createComboBox() {
        return new SpringComboBox();
    }
}
