package com.ytt.designpattern.dailimoshi.jdkdaili.imp;

import com.ytt.designpattern.dailimoshi.jdkdaili.ForumService;

/**
 * Created by ytt on 2018/12/24.
 */
public class ForumServiceImpl implements ForumService{

    public void removeTopic(int topicId) {
        try {
            Thread.currentThread().sleep(20);
            System.out.println("模拟删除Topic记录：" + topicId);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void removeForum(int forumId) {
        try {
            Thread.currentThread().sleep(20);
            System.out.println("模拟删除Forum记录：" + forumId);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
