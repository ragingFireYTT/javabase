package com.ytt.design_pattern.xing_wei.jie_shi_qi.one;

/**
 * Created by ytt on 2018/12/26.
 *
 * and 解释器。
 */
public class AndNode extends AbstractNode {

    private AbstractNode left;
    private AbstractNode right;

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    // 解释
    public String interpret() {
        return left.interpret() + "再" +right.interpret();
    }
}
