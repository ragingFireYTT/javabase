package com.ytt.design_pattern.xing_wei.ming_ling.log;

import java.io.Serializable;

/**
 * Created by ytt on 2018/12/25.
 */
abstract class Command implements Serializable {
    protected String name; //命令名称
    protected String args; //命令参数
    protected ConfigOperator configOperator; //接受者

    public Command(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConfigOperator(ConfigOperator configOperator) {
        this.configOperator = configOperator;
    }

    //执行命令
    public abstract void execute(String args);
    public abstract void execute();
}
