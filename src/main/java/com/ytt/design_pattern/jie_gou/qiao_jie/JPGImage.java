package com.ytt.design_pattern.jie_gou.qiao_jie;

/**
 * Created by ytt on 2018/12/25.
 */
public class JPGImage extends Image {
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为JPG。");
    }
}
