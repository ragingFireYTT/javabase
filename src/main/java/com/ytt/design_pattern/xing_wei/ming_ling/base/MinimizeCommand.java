package com.ytt.design_pattern.xing_wei.ming_ling.base;

/**
 * Created by ytt on 2018/12/25.
 *
 * 最小化窗口命令类：具体命令
 */
public class MinimizeCommand extends Command {
    private WindowHandler whObj; //关联，实际处理者

    public MinimizeCommand() {
        this.whObj = new WindowHandler();
    }

    // 命令执行方法。
    public void execute() {
        whObj.minimize();
    }
}
