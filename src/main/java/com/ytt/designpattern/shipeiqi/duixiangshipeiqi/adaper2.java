package com.ytt.designpattern.shipeiqi.duixiangshipeiqi;

import com.ytt.designpattern.shipeiqi.leishipeiqi.V3I;
import com.ytt.designpattern.shipeiqi.leishipeiqi.V5;

/**
 * Created by ytt on 2018/12/21.
 */
public class adaper2 implements V3I {

    V5 v5 = new V5();
    public void chongDian3() {
        v5.chongDian5();
        System.out.println("把 5V 电变 3V");
    }
}
