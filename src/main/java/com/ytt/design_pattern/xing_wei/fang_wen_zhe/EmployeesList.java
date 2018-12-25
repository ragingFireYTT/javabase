package com.ytt.design_pattern.xing_wei.fang_wen_zhe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ytt on 2018/12/25.
 *
 * 集合。类比，处方单，里面有不同的元素信息。
 */
public class EmployeesList {
    public List<Employee> arrayList = new ArrayList<Employee>();

    public void addEmployee(Employee employee){
        arrayList.add(employee);
    }

    public void accept(Department department){
        for (Employee employee : arrayList) {
            employee.accept(department);
        }
    };
}
