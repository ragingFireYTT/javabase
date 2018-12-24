package com.ytt.designpattern.dailimoshi.jdkdaili.imp;

import com.ytt.designpattern.dailimoshi.jdkdaili.ForumService;
import org.junit.Test;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
