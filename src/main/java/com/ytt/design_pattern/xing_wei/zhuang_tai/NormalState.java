package com.ytt.design_pattern.xing_wei.zhuang_tai;

/**
 * Created by ytt on 2018/12/26.
 */
public class NormalState extends AccountState {

    public NormalState(Account account) {
        super(account);
    }

    public NormalState(AccountState state) {
        super(state);
    }

    public void deposit(double amount) {
        account.setBalance(account.getBalance()+amount);
        this.stateCheck();
    }

    public void withdraw(double amount) {
        account.setBalance(account.getBalance()-amount);
        this.stateCheck();
    }

    public void computeInterest() {
        System.out.println("正常状态，无须支付利息！");
    }

    // 状态转换
    public void stateCheck() {
        if (account.getBalance()>-2000 && account.getBalance()<=0) {
            account.setState(new OverdraftState(this));
        }else if (account.getBalance() == -2000) {
            account.setState(new RestrictedState(this));
        }
        else if (account.getBalance() < -2000) {
            System.out.println("操作受限！");
        }
    }
}
