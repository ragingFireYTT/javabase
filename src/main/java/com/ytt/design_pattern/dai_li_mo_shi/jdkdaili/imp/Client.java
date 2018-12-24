package com.ytt.design_pattern.dai_li_mo_shi.jdkdaili.imp;

import com.ytt.design_pattern.dai_li_mo_shi.jdkdaili.ForumService;

import java.lang.reflect.Proxy;

/**
 * Created by ytt on 2018/12/24.
 */
public class Client {
    public static void main(String[] args) {
        // 设置代理文件可以查看 com.sun.proxy.$Proxy0
        //System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        // 或者            -Dsun.misc.ProxyGenerator.saveGeneratedFiles=true。
        ForumService target = new ForumServiceImpl();

        PerformanceHandler handler = new PerformanceHandler(target);

        ForumService o =(ForumService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), handler);
        o.removeForum(10);
        o.removeTopic(1012);

    }
}
