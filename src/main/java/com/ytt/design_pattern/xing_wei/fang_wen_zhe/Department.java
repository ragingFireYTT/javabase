package com.ytt.design_pattern.xing_wei.fang_wen_zhe;

/**
 * 访问者，抽象类
 * Created by ytt on 2018/12/25.
 */
abstract class Department {
    abstract void visit(FullTimeEmployee employee);
    abstract void visit(ParTimeEmployee employee);
}
