package com.ytt.design_pattern.jie_gou.shi_pei_qi.duixiangshipeiqi;

import com.ytt.design_pattern.jie_gou.shi_pei_qi.leishipeiqi.V3I;
import com.ytt.design_pattern.jie_gou.shi_pei_qi.leishipeiqi.V5;

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
