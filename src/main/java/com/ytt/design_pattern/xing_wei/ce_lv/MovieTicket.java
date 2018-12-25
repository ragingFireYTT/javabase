package com.ytt.design_pattern.xing_wei.ce_lv;

/**
 * Created by ytt on 2018/12/25.
 * 电影票： 环境类
 */
public class MovieTicket {
    private double price;
    private Discount discount;

    public double getPrice() {
        return discount.disCount(price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
