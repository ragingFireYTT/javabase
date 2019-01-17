package com.ytt.jdk.util.queue;

import org.junit.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by ytt on 2018/12/26.
 */
public class MyTest {
    /**
     * 测试， 同步queue。
     * 特点：
     * 阻塞。
     * 容量为1。
     *
     * @throws InterruptedException
     */
    @Test
    public void testSynchronousQueue() throws InterruptedException {
        final BlockingQueue<String> blockingQueue = new SynchronousQueue<String>();
        new Thread(new Runnable() {
            public void run() {
                try {
                    blockingQueue.put("a");
                    System.out.println("put");
                    blockingQueue.put("s"); // 等，插
                    System.out.println("put");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                try {
                    System.out.println(blockingQueue.take()+"移除");  // 等，移除
                    Thread.sleep(2000);
                    System.out.println(blockingQueue.take()+"移除");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        Thread.currentThread().join();
    }
}
