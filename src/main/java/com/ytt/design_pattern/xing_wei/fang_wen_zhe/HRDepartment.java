package com.ytt.design_pattern.xing_wei.fang_wen_zhe;

/**
 * Created by ytt on 2018/12/25.
 *
 * 人力资源部
 */
public class HRDepartment extends Department {
    //实现人力资源部对全职员工的访问
    public void visit(FullTimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("正式员工" + employee.getName() + "实际工作时间为：" + workTime + "小时。");
        if (workTime > 40) {
            System.out.println("正式员工" + employee.getName() + "加班时间为：" + (workTime - 40) + "小时。");
        } else if (workTime < 40) {
            System.out.println("正式员工" + employee.getName() + "请假时间为：" + (40 - workTime) + "小时。");
        }
    }

    //实现人力资源部对兼职员工的访问
    public void visit(ParTimeEmployee employee) {
        int workTime = employee.getWorkTime();
        System.out.println("临时工" + employee.getName() + "实际工作时间为：" + workTime + "小时。");
    }

}
