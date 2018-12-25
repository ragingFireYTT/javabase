package com.ytt.design_pattern.xing_wei.mo_ban;

import java.util.logging.Handler;

/**
 * Created by ytt on 2018/12/25.
 * <p>
 * 账户类
 */
abstract class Account {

    protected int liXi;

    //模板方法
    public String handler(String account, String password) {
        if (validate(account, password)){
            if (displayCalculateInterest()){
                calculateInterest();
            }
            display();
        }else {
            return "验证失败";
        }
        return "成功";
    }




    // 验证用户信息
    boolean validate(String account, String password) {
        System.out.println("账号：{" + account + "}");
        System.out.println("密码：{" + password + "0}");

        //模拟登录
        if (account.equals("张无忌") && password.equals("123456")) {
            return true;
        } else {
            return false;
        }
    }

    //控制是否，计算利息====钩子方法=====子类重写，控制流程
    protected  boolean displayCalculateInterest(){
        return true;
    };
    //计算利息
    abstract void calculateInterest();

    public void display() {
        System.out.println("利息是：" + liXi);
    }
}
