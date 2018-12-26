package com.ytt;

import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by ytt on 2018/12/20.
 */
public class temp {
    public static void main(String[] args) {
        Integer i = 100;
        System.out.println(i.hashCode());
        Object o = new Object();
        o.hashCode();
        Stack stack = new Stack();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
    }
}
