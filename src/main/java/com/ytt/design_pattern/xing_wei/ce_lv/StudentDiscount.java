package com.ytt.design_pattern.xing_wei.ce_lv;

/**
 * Created by ytt on 2018/12/25.
 */
public class StudentDiscount implements Discount {
    public double disCount(double price) {
        System.out.println("学生票：");
        return price * 0.8;
    }
}
