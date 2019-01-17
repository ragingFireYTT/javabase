package com.ytt.jdk.enumm;

/**
 * Created by ytt on 2019/1/15.
 */
public enum TT {
    MM("mm"),
    NN("nn");

    private TT(String s) {
        this.value = s;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
