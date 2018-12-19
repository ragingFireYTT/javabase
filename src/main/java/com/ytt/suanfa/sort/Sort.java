package com.ytt.suanfa.sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;


/**
 * Created by ytt on 2018/12/19.
 */
public class Sort {
    int[] arr;

    @Before
    public void init() {
        //arr = new int[]{10, 1, 12, 4, 17, 23, 11, 4};
        arr = new int[]{5, 1, 5, 4, 17, 23, 5, 4, 11, 44, 78, 12, 34, 4, 12, 5, 8, 9, 22, 25, 51};
        Tool.printA(arr);
        //System.out.println(Arrays.toString(arr));
    }

    static class Tool {
        public static void printA(int[] a) {
            for (int i = 0; i < a.length; i++) {
                System.out.print("a[" + i + "]=" + a[i] + "   ");
            }
            System.out.println();
        }
    }

    //region 冒泡
    // 冒，一轮，取出一个极值，放到一端
    @Test
    public void testMaoPao() {
        // lun 轮数
        for (int lun = 1; lun <= arr.length - 1; lun++) {
            // 一轮中， 冒泡比较次数 i = 未排序个数 -1
            for (int i = 1; i <= arr.length - lun; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }
        System.out.println("最终结果==========");
        Tool.printA(arr);
    }
    //endregion

    //region 快速排序
    // 比基准小 < 基准 < 比基准大 ----- 找到一对交换 ----- 相遇
    //冒泡 a[0]=1   a[1]=4   a[2]=4   a[3]=4   a[4]=5   a[5]=5   a[6]=5   a[7]=5   a[8]=8   a[9]=9   a[10]=11   a[11]=12   a[12]=12   a[13]=17   a[14]=22   a[15]=23   a[16]=25   a[17]=34   a[18]=44   a[19]=51   a[20]=78
    //快速 a[0]=1   a[1]=4   a[2]=4   a[3]=4   a[4]=5   a[5]=5   a[6]=5   a[7]=5   a[8]=8   a[9]=9   a[10]=11   a[11]=12   a[12]=12   a[13]=17   a[14]=22   a[15]=23   a[16]=25   a[17]=34   a[18]=44   a[19]=51   a[20]=78
    //快速 a[0]=1   a[1]=4   a[2]=4   a[3]=4   a[4]=5   a[5]=5   a[6]=5   a[7]=5   a[8]=8   a[9]=9   a[10]=11   a[11]=12   a[12]=12   a[13]=17   a[14]=22   a[15]=23   a[16]=25   a[17]=34   a[18]=44   a[19]=51   a[20]=78
    @Test
    public void testQuickSort() {
        quickSort(0, arr.length - 1);
        System.out.println("最终结果==========");
        Tool.printA(arr);
    }
    public void quickSort(int start, int end) {

            int jizhun = arr[start]; // 基准数
            int qian = start;
            int hou = end;

            while (qian < hou) {
                while (arr[hou] >= jizhun && qian < hou) {
                    hou = hou - 1;
                    System.out.println("从后找" + hou);
                }
                arr[qian] = arr[hou];
                System.out.println("前" + qian + "------后" + hou);
                Tool.printA(arr);

                while (arr[qian] <= jizhun && qian < hou) {
                    qian = qian + 1;
                    System.out.println("从前找" + qian);
                }
                arr[hou] = arr[qian];
                System.out.println("前" + qian + "------后" + hou);
                Tool.printA(arr);
                System.out.println("--------------一波结束---------------------");
            }
            //System.out.println("--------------------------------------------------------------------------一波迭代结束------------------------------------------------------------");
            arr[qian] = jizhun;
            // 此时 qian = hou

        // 此时 qian = hou
        if (start<qian){
            quickSort(start,qian); // 小 分区迭代
        }
        if (qian < end){
            quickSort(qian+1,end); // 大分区迭代
        }
    }
    //endregion
}
