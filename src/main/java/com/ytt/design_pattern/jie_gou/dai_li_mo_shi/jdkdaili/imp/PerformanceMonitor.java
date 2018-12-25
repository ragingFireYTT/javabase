package com.ytt.design_pattern.jie_gou.dai_li_mo_shi.jdkdaili.imp;

/**
 * Created by ytt on 2018/12/24.
 */
public class PerformanceMonitor {
    //ThreadLocal 调用性能监视相关信息。
    private static ThreadLocal<MethodPerformance> performance =
            new ThreadLocal<MethodPerformance>();

    public static void begin(String method) {
        System.out.println("开始 monitor ....");
        MethodPerformance methodPerformance = new MethodPerformance(method);
        performance.set(methodPerformance);
    }

    public static void  end(){
        System.out.println("结束 monitor ....");
        MethodPerformance mp = performance.get();
        mp.printPerformance();
    }
}
