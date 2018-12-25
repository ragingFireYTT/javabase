package com.ytt.design_pattern.xing_wei.ming_ling.base;

/**
 * Created by ytt on 2018/12/25.
 *
 * 帮助命令
 */
public class HelpCommand extends Command {
    private HelpHandler hhObj; //维持对请求接收者的引用

    public HelpCommand() {
        hhObj = new HelpHandler();
    }

    //命令执行方法，将调用请求接收者的业务方法
    public void execute() {
        hhObj.display();
    }
}
