package com.ytt.design_pattern.xing_wei.ce_lv;

/**
 * Created by ytt on 2018/12/25.
 * Discount: 折扣
 * 折扣抽象类。 策略抽象类
 */
interface Discount {
    // 打折
    public double  disCount(double  price);
}
