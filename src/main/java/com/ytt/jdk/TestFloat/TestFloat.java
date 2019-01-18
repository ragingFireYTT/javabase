package com.ytt.jdk.TestFloat;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * Created by ytt on 2019/1/17.
 */
public class TestFloat {
    public static void main(String[] args) {
        double x = 2.00;
        double y = 1.10;
        System.out.println(x - y);
        System.out.println(y);
        System.out.println(2.00 - 1.10);
        System.out.println(2.00f - 1.10f);
        float a = 1.00f;
        double b = 1.00;
        double c = 1.00f;
        System.out.println(b == c);
    }

    /**
     * char 转为 byte 数组
     *
     * @throws UnsupportedEncodingException
     */
    @Test
    public void test() throws UnsupportedEncodingException {
        char a = '中'; // 2 byte-- 4E2D---20013---1001110 00101101
        byte[] b = new byte[2];

        b[0] = (byte) (a >>> 8);  // >>> 无符号位运算
        b[1] = (byte) (a + 0);      // int 强转， 保留低位。
        System.out.println(Integer.toBinaryString(b[0]));
        System.out.println(Integer.toBinaryString(b[1]));
        System.out.println(Integer.toBinaryString(a)); // Integer Long 中有方法 2进制字符输出。

    }

    /**
     * 测试位运算
     * 2进制：0b
     * <p>
     * & 与
     * >>> 右移
     */
    @Test
    public void testBitYunSun() {
        System.out.println(0b1100);
        byte a = 0b1100;
        int i = 0b1100 & 0b0111;
        System.out.println("0b" + Integer.toBinaryString(i));
    }
}
