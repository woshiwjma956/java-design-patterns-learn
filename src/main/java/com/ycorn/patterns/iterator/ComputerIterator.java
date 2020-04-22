package com.ycorn.patterns.iterator;

import java.util.Iterator;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-22 22:26
 */
public class ComputerIterator implements Iterator<Dept> {

    private Dept[] depts;

    private int position = 0;

    public ComputerIterator(Dept[] depts) {
        this.depts = depts;
    }

    @Override
    public boolean hasNext() {
        return position <= depts.length && depts[position] != null;
    }

    @Override
    public Dept next() {
        Dept dept = depts[position];
        position++;
        return dept;
    }
}