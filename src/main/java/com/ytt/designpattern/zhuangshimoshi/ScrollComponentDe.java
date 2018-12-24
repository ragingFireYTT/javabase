package com.ytt.designpattern.zhuangshimoshi;

/**
 * Created by ytt on 2018/12/23.
 * 滚动条，扩展器，装饰器
 */
public class ScrollComponentDe extends ComponentDe {
    public ScrollComponentDe(Component component) {
        super(component);
    }

    @Override
    public void display() {
        setScrollBar();
        super.display();
    }

    //设置滚动条
    private void setScrollBar() {
        System.out.println("滚动条有了");
    }
}