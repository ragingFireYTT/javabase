package com.ytt.design_pattern.xing_wei.ming_ling.log;

import java.io.Serializable;

/**
 * Created by ytt on 2018/12/25.
 * 配置文件操作类。
 * 实际的执行者。
 */
public class ConfigOperator implements Serializable{

    public void insert(String args) {
        System.out.println("增加新节点：" + args);
    }

    public void modify(String args) {
        System.out.println("修改节点：" + args);
    }

    public void delete(String args){
        System.out.println("删除节点：" + args);
    }
}
