package com.ytt.thread.subject1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Timer;

/**
 * Created by ytt on 2018/12/15.
 */
public class MyMain {
    public static void main(String[] args) throws InterruptedException {
        long startA = System.currentTimeMillis();
        List<Integer> list = new PrimeNumberClient().start();
        long endA= System.currentTimeMillis();
        System.out.println("多线程执行时间："+(endA -startA)+"毫秒");
        list.sort(new Comparator() {
            public int compare(Object o1, Object o2) {
                if ((int) o1 > (int) o2) {
                    return 1;
                } else if ((int) o2 > (int) o1) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });



        // 单线程运行
        List<Integer> primes = new ArrayList<Integer>();
        long startB = System.currentTimeMillis();
        getPrimeNumber(1, 400000, primes);
        long endB= System.currentTimeMillis();
        System.out.println("单线程执行时间："+(endB-startB)+"毫秒");
        System.out.println("-----------"+list.size()+"------"+primes.size());
        primes.sort(new Comparator() {
            public int compare(Object o1, Object o2) {
                if ((int) o1 > (int) o2) {
                    return 1;
                } else if ((int) o2 > (int) o1) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });


        // 校验单线程和多线程的结果是否相同
        for (int i = 0; i < list.size(); i++) {
            if (primes.get(0).equals(list.get(0))) {
                System.out.println("相等:"+i);
            }else {
                System.out.print("list.get("+i+") = " + list.get(i));
                System.out.println("primes.get(i) = " + primes.get(i));
            }
        }
        System.out.println("--------------结束---------------");
    }


    public static List getPrimeNumber(int start, int end, List primes) {

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
        return primes;
    }

}
