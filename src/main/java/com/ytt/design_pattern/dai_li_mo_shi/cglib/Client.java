package com.ytt.design_pattern.dai_li_mo_shi.cglib;

import com.ytt.design_pattern.dai_li_mo_shi.jdkdaili.imp.ForumServiceImpl;
import net.sf.cglib.core.DebuggingClassWriter;
import org.junit.Test;

/**
 * Created by ytt on 2018/12/24.
 */
public class Client {
    /**
     * 测试 cglib
     */
    @Test
    public void proxy(){
        // 代理 的生成路径
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\Dev\\Java_Project\\javabase\\cglib");
        CglibProxy proxy = new CglibProxy();
        ForumServiceImpl forumService = (ForumServiceImpl) proxy.getProxy(ForumServiceImpl.class);
        forumService.removeTopic(10);
        forumService.removeTopic(1023);
    }
}
