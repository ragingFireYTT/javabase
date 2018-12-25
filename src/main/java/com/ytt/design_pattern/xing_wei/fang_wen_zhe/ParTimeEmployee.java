package com.ytt.design_pattern.xing_wei.fang_wen_zhe;

/**
 * Created by ytt on 2018/12/25.
 *
 * 具体员工： 临时员工
 */
public class ParTimeEmployee implements Employee {
    private String name;
    private double hourWage;
    private int workTime;
    public void accept(Department department) {
        department.visit(this);
    }


    public ParTimeEmployee(String name, double hourWage, int workTime) {
        this.name = name;
        this.hourWage = hourWage;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourWage() {
        return hourWage;
    }

    public void setHourWage(double hourWage) {
        this.hourWage = hourWage;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }
}
