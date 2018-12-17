package com.ytt.thread.subject2;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by ytt on 2018/12/16.
 */
public class MyObject {

    private AtomicBoolean isNum = new AtomicBoolean(true);
    private int i = 1;
    private int b = 65; // A 的 ASCII 是65

    //region 普通方法

    /**
     * synchronized 修饰普通方法 锁住 this 对象
     */
    public synchronized void printNum() {
        while (i < 53) {
            if (isNum.get()) {
                System.out.print(i++);
                System.out.print(i++);
                isNum.set(false);
                //MyObject.class.notifyAll(); ------------Illegal Monitor State Exception
                this.notifyAll();
            } else {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    public synchronized void printA() {
        while (b < 91) {
            if (false == isNum.get()) {
                char a = (char) b;
                System.out.print(a);
                b = b + 1;
                isNum.set(true);
                this.notifyAll();
            } else {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //endregion

    //region 测试静态 方法 synchronized 锁住 类 class
    private static int iS = 1;
    private static int bS = 65;
    private static AtomicBoolean isNumS = new AtomicBoolean(true);

    public static synchronized void printNumStatic() {
        while (iS < 53) {
            if (isNumS.get()) {
                System.out.print(iS++);
                System.out.print(iS++);
                isNumS.set(false);
                //MyObject.class.notifyAll(); ------------Illegal Monitor State Exception
                MyObject.class.notifyAll();
            } else {
                try {
                    MyObject.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    public static synchronized void printAStatic() {
        while (bS < 91) {
            if (false == isNumS.get()) {
                char a = (char) bS;
                System.out.print(a);
                bS = bS + 1;
                isNumS.set(true);
                MyObject.class.notifyAll();
            } else {
                try {
                    MyObject.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //endregion

}
