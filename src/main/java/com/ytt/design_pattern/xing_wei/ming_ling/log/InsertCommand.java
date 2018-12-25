package com.ytt.design_pattern.xing_wei.ming_ling.log;

/**
 * Created by ytt on 2018/12/25.
 */
public class InsertCommand extends Command {

    public InsertCommand(String name) {
        super(name);
    }

    public void execute(String args) {
        this.args = args;
        configOperator.insert(args);
    }

    public void execute() {
        configOperator.insert(args);
    }
}
