package com.ytt.jdk.TestPackge.packge2;

import com.ytt.jdk.TestPackge.packge1.Parent;

/**
 * Created by ytt on 2019/1/19.
 */
public class BuTong {
    public static void main(String[] args) {
        Parent p = new Parent();
        //p.pPro();
        //p.pDef();  error: BuTong --> 访问 --> parent ======= 不同包
        p.pPub();
        Son son = new Son();
        //son.pPro(); //
    }
}
