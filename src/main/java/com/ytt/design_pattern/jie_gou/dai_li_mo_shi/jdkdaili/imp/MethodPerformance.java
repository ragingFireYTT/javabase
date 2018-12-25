package com.ytt.design_pattern.jie_gou.dai_li_mo_shi.jdkdaili.imp;

/**
 * Created by ytt on 2018/12/24.
 *
 * 方法性能监视类。  Performance,性能
 */
public class MethodPerformance {

    private long begin;
    private long end;
    private String serviceMethod;

    public MethodPerformance(String method) {
        this.serviceMethod = method;
        this.begin = System.currentTimeMillis();
    }

    public void printPerformance() {
        end = System.currentTimeMillis();
        long elapse = end - begin;
        System.out.println(serviceMethod + "执行花费实际" + elapse + "毫秒");
    }
}
