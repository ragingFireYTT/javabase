package com.ytt.jdk.TestClassLefe.ClassShiLiHua;

/**
 * Created by ytt on 2019/1/20.
 */
public class TestShiLiHua {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Must enter any two");
            return;
        }
        System.out.println(args[0] + args[1]);
    }
}
