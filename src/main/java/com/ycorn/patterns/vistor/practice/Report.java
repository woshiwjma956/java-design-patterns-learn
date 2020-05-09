package com.ycorn.patterns.vistor.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/9 17:34
 */

public class Report {

    List<Staff> staffs = new ArrayList<>();

    public Report() {
        staffs.add(new Manager("经理-A"));
        staffs.add(new Engineer("工程师-A"));
        staffs.add(new Engineer("工程师-B"));
        staffs.add(new Engineer("工程师-C"));
        staffs.add(new Manager("经理-B"));
        staffs.add(new Engineer("工程师-D"));
    }

    public void showReport(Visitor visitor){
        for (Staff staff : staffs) {
          staff.accept(visitor);
        }
    }
}
