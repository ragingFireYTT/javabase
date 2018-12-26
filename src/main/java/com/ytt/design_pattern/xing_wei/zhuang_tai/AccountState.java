package com.ytt.design_pattern.xing_wei.zhuang_tai;

/**
 * Created by ytt on 2018/12/26.
 */
abstract class AccountState {
    protected Account account; // 关联账户

    public AccountState(Account account){
        this.account = account;
    }
    public AccountState(AccountState state){
        this.account = state.account;
    }
    // 依赖状态的操作
    public abstract void deposit(double amount); // 存款
    public abstract void withdraw(double amount); // 取款
    public abstract void computeInterest(); // 计算利息
    public abstract void stateCheck(); // 状态转换
}
