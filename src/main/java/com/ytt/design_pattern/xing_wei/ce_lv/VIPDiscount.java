package com.ytt.design_pattern.xing_wei.ce_lv;

/**
 * Created by ytt on 2018/12/25.
 */
public class VIPDiscount implements Discount {
    public double disCount(double price) {
        System.out.println("VIP票：");
        System.out.println("增加积分！");
        return price * 0.5;
    }
}
