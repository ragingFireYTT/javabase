package com.ytt.designpattern.zuhemoshi;

import java.util.ArrayList;

/**
 * Created by ytt on 2018/12/22.
 */
public class Folder extends AbstractFile {
    // 聚合 AbstractFile
    private ArrayList<AbstractFile> fileArrayList = new ArrayList<AbstractFile>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        fileArrayList.add(file);
    }

    public void remove(AbstractFile file) {
        fileArrayList.remove(file);
    }

    public AbstractFile getChild(int i) {
        return fileArrayList.get(i);
    }

    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");  //模拟杀毒
        for (AbstractFile abstractFile : fileArrayList) {
            abstractFile.killVirus();
        }
    }
}
