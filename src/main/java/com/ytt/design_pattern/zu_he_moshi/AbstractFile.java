package com.ytt.design_pattern.zu_he_moshi;

/**
 * Created by ytt on 2018/12/22.
 */
abstract class AbstractFile {
    // 添加文件(容器构件 方法)
    public abstract void add(AbstractFile file);

    // 删除文件(容器构件 方法)
    public abstract void remove(AbstractFile file);

    // 获得儿子(容器构件 方法)
    public abstract AbstractFile getChild(int i);

    // 杀毒
    public abstract void killVirus();
}
