package com.ytt.design_pattern.xing_wei.jie_shi_qi.two;

/**
 * Created by ytt on 2018/12/26.
 * <p>
 * 循环命令节点类：非终结符表达式
 */

class LoopCommandNode extends Node {
    private int number; //循环次数
    private Node commandNode; //循环语句中的表达式

    //解释循环命令
    public void interpret(Context context) {
        context.skipToken("LOOP");
        number = context.currentNumber();
        context.nextToken();
        commandNode = new ExpressionNode(); //循环语句中的表达式
        commandNode.interpret(context);
    }

    public void execute() {
        for (int i = 0; i < number; i++)
            commandNode.execute();
    }
}

