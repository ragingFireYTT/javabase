package com.ytt.design_pattern.xing_wei.mo_ban;

/**
 * Created by ytt on 2018/12/25.
 *
 * 现金账户
 */
public class CurrentAccount extends Account{
    void calculateInterest() {
        System.out.println("按活期利率计算利息！");
    }

    @Override
    protected boolean displayCalculateInterest() {
        return false;
    }
}
