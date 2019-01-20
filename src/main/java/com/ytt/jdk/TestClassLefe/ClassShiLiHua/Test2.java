package com.ytt.jdk.TestClassLefe.ClassShiLiHua;

/**
 * Created by ytt on 2019/1/20.
 *
 * 1. this super 只能出现一个
 * 2. 只能在第一行开始调用
 * 3. 除了 object <init>() 方法都是从另外一个 <init>()方法开始。--或者本来的，或者超类
 */
public class Test2 {
    private int width = 3;

    Test2() {
        this(1); // 只能出现在第一行
        System.out.println("(),width= " + width);
    }

    Test2(int width) {// 默认生对超类的调用
        this.width = width;
        System.out.println("(int),width= " + width);
    }

    Test2(String msg) {
        super(); // 只能在第一行
        //this(); // 只能出现一个

        System.out.println("(int),width= " + width);
        System.out.println(msg);
    }

    public static void main(String[] args) {
        String msg = "----";
        Test2 one = new Test2();
        System.out.println("==============");
        Test2 tow = new Test2(2);
        System.out.println("==============");
        Test2 three = new Test2(msg);
    }
}
