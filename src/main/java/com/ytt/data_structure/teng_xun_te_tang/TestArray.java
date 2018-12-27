package com.ytt.data_structure.teng_xun_te_tang;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by ytt on 2018/12/26.
 */
public class TestArray {

    /**
     * 数组添加元素
     */
    @Test
    public void testArrayAdd() {
        //数组长度不可变
        int[] arr = new int[]{9, 8, 7};
        System.out.println(Arrays.toString(arr));

        // 要新增的 元素
        int i = 6;
        int[] arrN = new int[arr.length + 1];
        for (int j = 0; j < arr.length; j++) {
            arrN[j] = arr[j];
        }
        arrN[arrN.length - 1] = i;
        arr = arrN;
        Arrays.toString(arr);
    }

    /**
     * 数组删除元素
     */
    @Test
    public void testDelArray() {
        int[] arr = new int[]{9, 8, 7, 6};
        System.out.println(Arrays.toString(arr));

        // 删除 下标 3
        int[] arrN = new int[arr.length - 1];
        for (int i = 0; i < arr.length-1; i++) {
            arrN[i] = arr[i];
        }
        arr = arrN;
        System.out.println(Arrays.toString(arr));
    }

    /**
     * recursive 递归的；循环的
     */
    @Test
    public void testRecursive(){
        //recursive(0);

        //febona(1,1);

        //System.out.println(getfebona(5));
        han(4,'A','B','C');
    }

    // 斐波那契数列： 1 1 2 3 5 8 13
    public void febona(int i, int j){
        if (j>1000){
            return;
        }
        int sum = i +j;
        System.out.print(sum+"\t");
        febona(j,sum);
        System.out.print(sum+"\t");
    }
    // 打印第 i 个
    public int getfebona(int i){
        if (i ==1 || i==2){
            return 1;
        }else {
            return getfebona(i-1) + getfebona(i -2 );
        }
    }

    public void recursive(int deep){
        System.out.println("深度"+ deep +"开始");
        if (deep ==10){
        }else {
            recursive(deep+1);
        }

        System.out.println("深度"+ deep +"结束");
    }
    //汉诺塔问题

    public void han(int n,char from ,char tmp ,char to){
        if (n==1){
            System.out.println("从第1个盘子"+from+"到"+to);
        }else {
            han(n-1,from,to,tmp);
            System.out.println("第"+n+"个盘子"+from+"移动"+to);
            han(n-1,tmp,from,to);
        }

    }
}
