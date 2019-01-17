package com.ytt.jdk.enumm;

/**
 * Created by ytt on 2019/1/15.
 *
 * enum：枚举类
 *      1. 本质是继承了 java.lang.Enum<E>
 */
public enum Color {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0), // == public static final Color BLACK=new Color(0, 0, 0);
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);
    // 构造枚举值，比如RED(255,0,0)
    private Color(int r, int g, int b) {
        this.redValue = r;
        this.greenValue = g;
        this.blueValue = b;
    }

    public String toString() {
        return super.toString() + "(" + redValue + "," + greenValue + "," + blueValue + ")";
    }

    // 自定义数据域，private为了封装。
    private int redValue;
    private int greenValue;
    private int blueValue;

    public int getRedValue() {
        return redValue;
    }

    public int getGreenValue() {
        return greenValue;
    }

    public int getBlueValue() {
        return blueValue;
    }
}
