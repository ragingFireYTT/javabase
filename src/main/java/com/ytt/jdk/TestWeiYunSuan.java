package com.ytt.jdk;

import org.junit.Test;

/**
 * Created by ytt on 2019/1/18.
 * <p>
 * 测试位运算。
 * 位：
 *   针对存储的2进制进行的运行。负数使用补码。
 */
public class TestWeiYunSuan {

    @Test
    public void test() {
        //---位与
        System.out.println("---位与"); // 都1 则1
        System.out.println("0b" + Integer.toBinaryString(6));
        System.out.println("0b-" + Integer.toBinaryString(3));
        System.out.println("0b-" + Integer.toBinaryString(2));
        System.out.println(6 & 3);

        //---位或
        System.out.println("---位或"); // 有1 则 1
        System.out.println("0b" + Integer.toBinaryString(6));
        System.out.println("0b-" + Integer.toBinaryString(3));
        System.out.println("0b" + Integer.toBinaryString(7));
        System.out.println(6 | 3);
        //---异或
        // 1. 一个数，异或同一个数两次还是一个数 --- 加密
        System.out.println("---异或"); // 相同为 1
        System.out.println("0b" + Integer.toBinaryString(6));
        System.out.println("0b-" + Integer.toBinaryString(3));
        System.out.println("0b" + Integer.toBinaryString(5));
        System.out.println(6 ^ 3);
        //---反码 。按位取反。
        System.out.println("---反码"); // 逐位取反，包括符号位
        System.out.println("0b" + Integer.toBinaryString(-6));
        System.out.println("0b" + Integer.toBinaryString(6));
        System.out.println(~6);

    }

    /**
     * 测试移位运算符
     * << 相当于 * 2,可以完成 2的次幂计算
     * >> 相当于 / 2
     * >>>: 无符号右移
     */
    @Test
    public void test2(){

    }

}
