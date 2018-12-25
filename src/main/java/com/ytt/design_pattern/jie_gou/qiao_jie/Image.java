package com.ytt.design_pattern.jie_gou.qiao_jie;

/**
 * Created by ytt on 2018/12/25.
 * 抽象图像类 ： 抽象类
 */
abstract class Image {
    protected ImageImp imp; // 抽象层关联

    public void setImageImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
