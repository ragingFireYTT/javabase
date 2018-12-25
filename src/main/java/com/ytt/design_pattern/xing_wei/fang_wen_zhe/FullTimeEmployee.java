package com.ytt.design_pattern.xing_wei.fang_wen_zhe;

/**
 * Created by ytt on 2018/12/25.
 *
 * 具体员工：全职员工
 */
public class FullTimeEmployee implements Employee {
    private String name;
    private double weeklyWage;
    private int workTime;

    public void accept(Department department) {
        department.visit(this);
    }

    public FullTimeEmployee(String name, double weeklyWage, int workTime) {
        this.name = name;
        this.weeklyWage = weeklyWage;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeeklyWage() {
        return weeklyWage;
    }

    public void setWeeklyWage(double weeklyWage) {
        this.weeklyWage = weeklyWage;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }
}
