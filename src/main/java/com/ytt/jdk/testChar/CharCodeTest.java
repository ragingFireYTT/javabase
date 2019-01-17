package com.ytt.jdk.testChar;


import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

/**



 <<:左移运算符，num << 1,相当于num乘以2
 >>:表示右移，如果该数为正，则高位补0，若为负数，则高位补1；
 >>>:表示无符号右移，也叫逻辑右移，即若该数为正，则高位补0，而若该数为负数，则右移后高位同样补0。

 // 下文代码没看

 */
public class CharCodeTest {

    /**
     * 将byte转换为对应的二进制字符串
     *
     * @param src 要转换成二进制字符串的byte值
     * @return
     */
    public static String byteToBinary(byte src) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            result.append(src % 2 == 0 ? '0' : '1');
            src = (byte) (src >>> 1);
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "I AM 中国人";
        System.out.println(Charset.defaultCharset());
        byte[] utf16 = str.getBytes("UTF-16");
        System.out.println(Arrays.toString(utf16));
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            byte high = (byte) (str.charAt(i) >>> 8);
            byte low = (byte) str.charAt(i);
            System.out.println(byteToBinary(high) + byteToBinary(low));
            System.out.println(byteToBinary(utf16[2 + 2 * i]) + byteToBinary(utf16[2 + 2 * i + 1]));
            System.out.println((byteToBinary(high) + byteToBinary(low)).equals(byteToBinary(utf16[2 + 2 * i]) + byteToBinary(utf16[2 + 2 * i + 1])));
        }
    }
}
