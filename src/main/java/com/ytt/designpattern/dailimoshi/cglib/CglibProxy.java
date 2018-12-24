package com.ytt.designpattern.dailimoshi.cglib;

import com.ytt.designpattern.dailimoshi.jdkdaili.imp.PerformanceMonitor;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by ytt on 2018/12/24.
 *
 * 1. 实现 methodInterceptor ， 代理类
 * 2. Enhancer 组装， 被代理类 和 代理类。
 */
public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    /**
     *
     * @param clazz 被代理的类
     * @return
     */
    public Object getProxy(Class clazz) {
        enhancer.setSuperclass(clazz); // 1. 设置需要创建子类的类。
        enhancer.setCallback(this);
        return enhancer.create();
    }

    //拦截父类所有方法的调用
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy)
            throws Throwable {
        PerformanceMonitor.begin(o.getClass().getName()+"."+method.getName());
        Object result = methodProxy.invokeSuper(o,args);
        PerformanceMonitor.end();
        return result;
    }
}
