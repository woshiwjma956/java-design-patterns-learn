package com.ycorn.patterns.iterator;

import java.util.Iterator;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-22 22:23
 */
public class ComputerCollageAgg implements Collage{

    private Dept[] depts;

    private int position = 0;

    public ComputerCollageAgg() {
        depts = new Dept[5];
        this.add(new Dept("java"));
        this.add(new Dept("php"));
        this.add(new Dept("hadoop"));
    }

    @Override
    public void add(Dept dept) {
        depts[position] = dept;
        position++;
    }

    @Override
    public Iterator<Dept> createIterator() {
        return new ComputerIterator(depts);
    }
}