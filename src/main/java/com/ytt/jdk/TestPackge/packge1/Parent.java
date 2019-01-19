package com.ytt.jdk.TestPackge.packge1;

/**
 * Created by ytt on 2019/1/19.
 * 访问修饰符——属性
 * private
 *      自己 --》访问--》自己
 * default
 *      兄弟 --》访问--》自己
 * protected
 *      兄弟+儿子 --》访问 --》自己
 * public
 *      都能方法自己
 *
 */
public class Parent {
    // 自己，调用，自己
    private void pPri() {
        System.out.println("parent-Pri");
    }

    void pDef() {
        System.out.println("parent-Def");
        pPri(); // 类 parent 调用了， parent 的 pPri 方法
    }

    protected void pPro() {
        System.out.println("parent-Pro");
    }

    public void pPub(){
        System.out.println("parent-Pub");
    }
}
