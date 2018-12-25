package com.ytt.design_pattern.jie_gou.dai_li_mo_shi.jdkdaili.imp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ytt on 2018/12/24.
 */
public class PerformanceHandler implements InvocationHandler {
    private Object target;
    public PerformanceHandler(Object target){
        this.target = target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PerformanceMonitor.begin(target.getClass().getName()+"."+method.getName());
        Object invoke = method.invoke(target, args);
        PerformanceMonitor.end();
        return null;
    }
}
