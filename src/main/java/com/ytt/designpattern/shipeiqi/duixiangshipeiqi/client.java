package com.ytt.designpattern.shipeiqi.duixiangshipeiqi;

import com.ytt.designpattern.shipeiqi.leishipeiqi.Adaper;
import com.ytt.designpattern.shipeiqi.leishipeiqi.V3I;

/**
 * Created by ytt on 2018/12/21.
 */
public class client {
    public static void main(String[] args) {
        V3I v3;
        v3 = new adaper2();
        geiShouJiChongDian(v3);
    }

    public static void geiShouJiChongDian(V3I v3I){
        v3I.chongDian3();
        System.out.println("充满了");
    }
}
