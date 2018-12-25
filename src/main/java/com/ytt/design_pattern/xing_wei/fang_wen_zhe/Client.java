package com.ytt.design_pattern.xing_wei.fang_wen_zhe;

/**
 * Created by ytt on 2018/12/25.
 */
public class Client {
    public static void main(String[] args) {
        EmployeesList list = new EmployeesList();
        Employee fte1,fte2,fte3,pte1,pte2;

        fte1 = new FullTimeEmployee("张无忌",3200.00,45);
        fte2 = new FullTimeEmployee("杨过",2000.00,40);
        fte3 = new FullTimeEmployee("段誉",2400.00,38);
        pte1 = new ParTimeEmployee("洪七公",80.00,20);
        pte2 = new ParTimeEmployee("郭靖",60.00,18);

        list.addEmployee(fte1);
        list.addEmployee(fte2);
        list.addEmployee(fte3);
        list.addEmployee(pte1);
        list.addEmployee(pte2);

        Department dep;
        dep = (Department)XMLUtil.getBean();
        list.accept(dep);
    }
}
