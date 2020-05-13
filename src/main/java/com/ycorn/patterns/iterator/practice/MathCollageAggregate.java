package com.ycorn.patterns.iterator.practice;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/12 17:33
 */

public class MathCollageAggregate implements Collage {
    Dept[] depts;

    private AtomicInteger position = new AtomicInteger(0);

    public MathCollageAggregate() {
        this.depts = new Dept[10];
        for (int i = 0; i < 5; i++) {
            this.add(new Dept("数学系部门" + i));
        }
    }

    public void add(Dept dept) {
        depts[position.getAndIncrement()] = dept;
    }

    public MathCollageIterator createIterator() {
        return new MathCollageIterator(depts);
    }

}
