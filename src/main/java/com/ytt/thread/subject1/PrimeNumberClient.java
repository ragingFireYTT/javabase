package com.ytt.thread.subject1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by ytt on 2018/12/15.
 */
public class PrimeNumberClient {

    private int coreSize;
    private List primes = Collections.synchronizedList(new ArrayList()); // 使用线程安全包装集合
    private CountDownLatch countDownLatch = new CountDownLatch(4);
    private int getSplitSize() {
        return 4;
    }

    public PrimeNumberClient() {
        this.coreSize = 4;
    }

    public PrimeNumberClient(int coreSize) {
        this.coreSize = coreSize;
    }

    /**
     * 开始任务
     */
    public List start() throws InterruptedException {
        // 1. 初始化线程池
        boolean isOk = true;
        ExecutorService pool = Executors.newFixedThreadPool(coreSize);
        try {
            pool.submit(new Handler(1,100000));
            pool.submit(new Handler(100000,200000));
            pool.submit(new Handler(200000,300000));
            pool.submit(new Handler(300000,400000));
            countDownLatch.await();
        } catch (Exception e) {
            e.printStackTrace();
            isOk = false;
        } finally {
            pool.shutdown();
            //pool.awaitTermination(1000l, TimeUnit.MILLISECONDS);
            return primes;
        }
    }

    /**
     * handler 线程
     */
    private class Handler extends Thread {
        private Integer start;
        private Integer end;
        public Handler(int start, int end){
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {

            for (int a = start; a < end; a++) {
                boolean isPrime = true;
                for (int i = 2; i < a; i++) {
                    if (a % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primes.add(a);
                    //System.out.println(a);
                }
            }

            countDownLatch.countDown();
        }
    }

}
