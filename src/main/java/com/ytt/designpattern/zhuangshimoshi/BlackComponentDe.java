package com.ytt.designpattern.zhuangshimoshi;

/**
 * Created by ytt on 2018/12/23.
 */
public class BlackComponentDe extends ComponentDe {
    public BlackComponentDe(Component component) {
        super(component);
    }

    //扩展功能
    @Override
    public void display() {
        setBlackBorder();
        super.display();
    }

    // 设置黑色边框
    private void setBlackBorder(){
        System.out.println("黑色边框有了");
    }
}
