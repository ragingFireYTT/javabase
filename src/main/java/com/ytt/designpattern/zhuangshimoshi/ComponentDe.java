package com.ytt.designpattern.zhuangshimoshi;

/**
 * Created by ytt on 2018/12/23.
 *
 * 1. Component 这种组件的装饰器,扩展组件父类。
 * 2. 继承 Component 不是必须的
 *      ----继承好处。客户端，可以统一对待，基本组件，和装饰后的组件。
 */
public class ComponentDe implements Component {
    Component component ;
    private ComponentDe(){
    }

    public ComponentDe(Component component){
        this.component = component;
    }
    public void display() {
        component.display();
    }
}
