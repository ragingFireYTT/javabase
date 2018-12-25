package com.ytt.design_pattern.xing_wei.ce_lv;

/**
 * Created by ytt on 2018/12/25.
 */
public class ChildrenDiscount implements Discount {
    public double disCount(double price) {
        System.out.println("儿童票：");
        return price - 10;
    }
}
