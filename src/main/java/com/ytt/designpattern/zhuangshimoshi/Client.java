package com.ytt.designpattern.zhuangshimoshi;

/**
 * Created by ytt on 2018/12/23.
 */
public class Client {
    public static void main(String[] args) {
        Component component;
        Component blackComponentDe,scrollComponentDe;

        component = new ListBox();

        blackComponentDe = new BlackComponentDe(component);
        blackComponentDe.display();


        System.out.println("---------------------");
        scrollComponentDe = new ScrollComponentDe(blackComponentDe);
        scrollComponentDe.display();
    }
}
