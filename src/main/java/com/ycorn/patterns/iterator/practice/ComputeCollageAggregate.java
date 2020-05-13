package com.ycorn.patterns.iterator.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/12 17:23
 */

public class ComputeCollageAggregate implements Collage {

    List<Dept> depts;

    public ComputeCollageAggregate() {
        this.depts = new ArrayList<>();
        depts.add(new Dept("计算机系部门1"));
        depts.add(new Dept("计算机系部门2"));
        depts.add(new Dept("计算机系部门3"));
        depts.add(new Dept("计算机系部门4"));
    }

    public void add(Dept dept) {
        depts.add(dept);
    }

    public ComputerCollageIterator createIterator() {
        return new ComputerCollageIterator(depts);
    }

    public List<Dept> getDepts() {
        return depts;
    }
}
