package com.ytt.design_pattern.xing_wei.jie_shi_qi.one;

/**
 * Created by ytt on 2018/12/26.
 *
 * 距离解释：终结符表达式
 */
public class DistanceNode extends AbstractNode {
    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    //距离表达式的解释操作
    public String interpret() {
        return this.distance;
    }
}
