package com.ytt.design_pattern.xing_wei.zhuang_tai;

/**
 * Created by ytt on 2018/12/26.
 */
public class Client {
    public static void main(String[] args) {
        Account acc = new Account("段誉",0.0);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.deposit(3000);
        acc.withdraw(4000);
        acc.withdraw(1000);
        acc.computeInterest();
    }
}
