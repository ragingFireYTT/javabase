package com.ytt.design_pattern.xing_wei.jie_shi_qi.one;

/**
 * Created by ytt on 2018/12/26.
 * <p>
 * 简单句子解释：非终结符表达式
 */
public class SentenceNode extends AbstractNode{

    private AbstractNode direction;
    private AbstractNode action;
    private AbstractNode distance;

    public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    //简单句子的解释操作
    public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }
}
