package com.ytt.jdk.TestClassLefe.ClassInit;

/**
 * Created by ytt on 2019/1/20.
 */
public class Examplelc {
    static int width;
    static int heigh = (int) (Math.random() * 2.0);

    static {
        width = 3 * (int) (Math.random() * 5.0);
    }
}
