package com.ytt.thread.subject2;

/**
 * Created by ytt on 2018/12/16.
 */
public class MyMain {
    public static void main(String[] args) throws InterruptedException {
        //region 测试普通方法
        MyObject myObject =new MyObject();
        new Thread(new Runnable() {
            @Override
            public void run() {
                myObject.printNum();
            }
        }).start();
        Thread threadA= new Thread(new Runnable() {
            @Override
            public void run() {
                myObject.printA();
            }
        });
        threadA.start();
        threadA.join(); // 等待当前线程结束
        //endregion

        System.out.println();
        System.out.println("----------------分隔符------------------");

        //region 测试静态方法
        new Thread(new Runnable() {
            @Override
            public void run() {
                MyObject.printNumStatic();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                MyObject.printAStatic();
            }
        }).start();
        //endregion
    }
}
