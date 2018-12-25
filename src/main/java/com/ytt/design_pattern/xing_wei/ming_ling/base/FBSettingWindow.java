package com.ytt.design_pattern.xing_wei.ming_ling.base;

import java.util.ArrayList;

/**
 * Created by ytt on 2018/12/25.
 */
public class FBSettingWindow {

    private String title; //窗口标题
    private ArrayList<FunctionButton> functionButtons = new ArrayList<FunctionButton>();


    public void display(){
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");

        for (Object obj : functionButtons) {
            System.out.println(((FunctionButton)obj).getName());
        }
        System.out.println("------------------------------");
    }


    public FBSettingWindow(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void addFunctionButton(FunctionButton fb) {
        functionButtons.add(fb);
    }

    public void removeFunctionButton(FunctionButton fb) {
        functionButtons.remove(fb);

    }
}
