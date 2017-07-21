package com.xiaofeng.utils.designpatterns.decorator;

/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/07/20
 * @email chenxf84@gmail.com
 */


public class ComponentDecorator extends Component {
    private Component component;  //维持对抽象构件类型对象的引用

    public ComponentDecorator(Component component)  //注入抽象构件类型的对象
    {
        this.component = component;
    }

    public void display() {
        component.display();
    }
}
