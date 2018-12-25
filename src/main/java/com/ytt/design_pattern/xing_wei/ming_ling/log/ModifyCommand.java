package com.ytt.design_pattern.xing_wei.ming_ling.log;

/**
 * Created by ytt on 2018/12/25.
 */
public class ModifyCommand extends Command {

    public ModifyCommand(String name) {
        super(name);
    }

    public void execute(String args) {
        this.args = args;
        configOperator.modify(args);
    }

    public void execute() {
        configOperator.modify(this.args);
    }

}
