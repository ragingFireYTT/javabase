package com.ytt.design_pattern.jie_gou.qiao_jie;

/**
 * Created by ytt on 2018/12/25.
 */
public class Client {
    public static void main(String[] args) {
        BMPImage bmpImage = new BMPImage();
        bmpImage.setImageImp(new LinuxImp());
        bmpImage.parseFile("小龙女");
    }
}
