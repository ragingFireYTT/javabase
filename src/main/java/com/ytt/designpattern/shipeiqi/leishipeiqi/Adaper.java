package com.ytt.designpattern.shipeiqi.leishipeiqi;

/**
 * Created by ytt on 2018/12/21.
 */
public class Adaper extends V5 implements V3I {
    public void chongDian3() {
        chongDian5();
        System.out.println("把 5V 电变 3V");
    }
}
