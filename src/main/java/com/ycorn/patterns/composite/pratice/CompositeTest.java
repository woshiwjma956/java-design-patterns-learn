package com.ycorn.patterns.composite.pratice;

import java.util.stream.Collectors;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/29 15:26
 */

public class CompositeTest {
    public static void main(String[] args) {
        //建学校
        School school = new School("hope school1");

        //建班级
        Classes a1 = new Classes("A1");
        Classes a2 = new Classes("A2");
        Classes a3 = new Classes("A3");
        Classes a4 = new Classes("A4");

        //组合学校和班级
        school.add(a1);
        school.add(a2);
        school.add(a3);
        school.add(a4);

        //建同学
        Classmate c1 = new Classmate("c1");
        Classmate c2 = new Classmate("c2");
        Classmate c3 = new Classmate("c3");
        Classmate c4 = new Classmate("c4");

        // 组合同学和班级
        a1.add(c1);
        a1.add(c2);
        a2.add(c3);
        a3.add(c4);

        school.print();
    }
}
