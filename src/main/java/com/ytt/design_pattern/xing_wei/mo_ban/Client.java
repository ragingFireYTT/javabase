package com.ytt.design_pattern.xing_wei.mo_ban;

/**
 * Created by ytt on 2018/12/25.
 */
public class Client {
    public static void main(String[] args) {
        Account account= new CurrentAccount();
        account.handler("张无忌","123456");
    }
}
