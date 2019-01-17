package com.ytt.jdk.testChar;

import java.io.UnsupportedEncodingException;

/**
 * Created by ytt on 2019/1/17.
 */
public class test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //𠀐
        String a= "𠀐"; // 1. 可使用的字符，和字符集有关。2. 实际存储长度和编码方式有关。

        //char b= '𠀐'; // 使用utf-16 的基本存储，只能表示Unicode 码面 0
        System.out.println(a.length()); // 2
        System.out.println(a.getBytes().length);//4
        System.out.println(a.getBytes("UTF-8").length); //4
        System.out.println(a.getBytes("UTF-16").length); //6
    }
}
