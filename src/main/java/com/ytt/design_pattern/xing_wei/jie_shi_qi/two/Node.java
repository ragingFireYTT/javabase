package com.ytt.design_pattern.xing_wei.jie_shi_qi.two;

/**
 * Created by ytt on 2018/12/26.
 *
 * 抽象节点类：抽象表达式
 */
abstract class Node {
    public abstract void interpret(Context text); //声明一个方法用于解释语句
    public abstract void execute(); //声明一个方法用于执行标记对应的命令
}
