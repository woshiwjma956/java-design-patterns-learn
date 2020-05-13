package com.ycorn.patterns.iterator.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/12 17:15
 */

public class ComputerCollageIterator implements Iterator<Dept> {
    private final String name;

    private List<Dept> depts;

    private AtomicInteger index = new AtomicInteger(0);

    private Integer size;


    public ComputerCollageIterator(List<Dept> depts) {
        this.name = "计算机";
        this.depts = depts;

    }

    @Override
    public boolean hasNext() {
        return index.get() < depts.size();
    }

    @Override
    public Dept next() {
        if (this.hasNext()) {
            return depts.get(index.getAndIncrement());
        }
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        int position = index.decrementAndGet();
        depts.remove(position);
    }


    public Integer getSize() {
        return depts.size();
    }
}
