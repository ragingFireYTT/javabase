package com.ytt.design_pattern.jie_gou.qiao_jie;

/**
 * Created by ytt on 2018/12/25.
 */
public class PNGImage extends Image {
    public void parseFile(String fileName) {
        //模拟解析PNG文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为PNG。");
    }
}
