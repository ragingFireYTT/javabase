package com.ytt.jdk.TestMethod;

/**
 * Created by ytt on 2019/1/20.
 * 方法的调用
 * 概念：
 * 1. 类方法，实例方法，对象的引用类型，对象的实际类型
 * 2. 静态绑定（先），动态（后）绑定
 */
public class Test1 {
    public static void main(String[] args) {
        // p 对象的，引用类型是 p，实际类型是 S
        P p = new S();
        //System.out.println(p.getSum()); //
        //------类方法，静态绑定

        S s = new S();
        System.out.println(s.sumS());

    }
}

class P {
    int i = 10;

    public int getSum() {
        return i + 10;
    }

    static int a = 10;

    public static int sumS() {
        return a + 10;
    }
}

class S extends P {
    //int i = 20;

    public int getSum() {
        return i + 20;
    }


}
