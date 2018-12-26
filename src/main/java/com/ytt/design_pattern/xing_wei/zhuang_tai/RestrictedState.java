package com.ytt.design_pattern.xing_wei.zhuang_tai;

/**
 * Created by ytt on 2018/12/26.
 *
 * 受限状态：具体状态类
 */
public class RestrictedState extends AccountState {


    public RestrictedState(Account account) {
        super(account);
    }

    public RestrictedState(AccountState state) {
        super(state);
    }

    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    public void withdraw(double amount) {
        System.out.println("帐号受限，取款失败");
    }

    public void computeInterest() {
        System.out.println("计算利息！");
    }

    public void stateCheck() {
        if(account.getBalance() > 0) {
            account.setState(new NormalState(this));
        }
        else if(account.getBalance() > -2000) {
            account.setState(new OverdraftState(this));
        }
    }
}
