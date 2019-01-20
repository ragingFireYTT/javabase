package com.ytt.jdk.TestClassLefe.TestShuXing;

/**
 * Created by ytt on 2019/1/20.
 *
 * 对象属性，相关测试。
 */
public class Son extends Parent {
    //String name;
    Integer age;

    public Son(String name) {
        super(name);
        System.out.println("Pre:super.name="+ super.name);
        System.out.println("Pre:this.name="+ this.name);
        this.name = "Son";
        System.out.println("End:super.name="+ super.name);
        System.out.println("End:this.name="+ this.name);
    }

    public static void main(String[] args) {
        new Son("Parent");
    }
}
