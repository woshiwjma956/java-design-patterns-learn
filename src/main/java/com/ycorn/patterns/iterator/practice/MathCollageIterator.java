package com.ycorn.patterns.iterator.practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/12 17:27
 */

public class MathCollageIterator implements Iterator<Dept> {
    Dept[] depts;

    private Integer size;

    public MathCollageIterator(Dept[] depts) {
        this.depts = depts;
    }

    private AtomicInteger index = new AtomicInteger(0);

    @Override
    public boolean hasNext() {
        return index.get() < depts.length && depts[index.get()] != null;
    }

    @Override
    public Dept next() {
        if (hasNext()) {
            return depts[index.getAndIncrement()];
        }
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        Dept[] newDepts = new Dept[depts.length - 1];
        index.decrementAndGet();
        for (int i = 0; i < depts.length - 1; i++) {
            if (index.get() <= i) {
                newDepts[i] = depts[i + 1];
            } else {
                newDepts[i] = depts[i];
            }
        }
        depts = newDepts;
    }

    public Integer getSize() {
        return depts.length;
    }

    public String getDeptsStr() {
        return Arrays.toString(depts);
    }
}
