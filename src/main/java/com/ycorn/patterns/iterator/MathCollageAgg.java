package com.ycorn.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-22 22:37
 */
public class MathCollageAgg implements Collage {

    List<Dept> depts;

    public MathCollageAgg() {
        depts = new ArrayList<>();
        depts.add(new Dept("base math"));
        depts.add(new Dept("advance math"));
        depts.add(new Dept("computer math"));
    }

    @Override
    public void add(Dept dept) {
        this.depts.add(dept);
    }

    @Override
    public Iterator<Dept> createIterator() {
        return new MathCollageIterator(depts);
    }
}