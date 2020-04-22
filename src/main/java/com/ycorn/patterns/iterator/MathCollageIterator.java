package com.ycorn.patterns.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-22 22:29
 */
public class MathCollageIterator implements Iterator<Dept> {

    List<Dept> depts;

    private int index = -1;

    public MathCollageIterator(List<Dept> depts) {
        this.depts = depts;
    }


    @Override
    public boolean hasNext() {
        if (index >= depts.size() - 1) return false;
        index++;
        return true;
    }

    @Override
    public Dept next() {
        return depts.get(index);
    }
}