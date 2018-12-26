package com.ytt.design_pattern.xing_wei.zhuang_tai;

/**
 * Created by ytt on 2018/12/26.
 *
 * 透支状态
 */
public class OverdraftState extends AccountState {

    public OverdraftState(Account account) {
        super(account);
    }

    public OverdraftState(AccountState state) {
        super(state);
    }

    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        stateCheck();
    }

    public void computeInterest() {
        System.out.println("计算利息！");
    }

    public void stateCheck() {
        if (account.getBalance() > 0) {
            account.setState(new NormalState(this));
        }
        else if (account.getBalance() >= -2000) {
            account.setState(new RestrictedState(this));
        }
        else if (account.getBalance() < -2000) {
            System.out.println("操作受限！");
        }

    }
}
