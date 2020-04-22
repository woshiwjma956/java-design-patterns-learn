package com.ycorn.patterns.iterator;

import java.util.Iterator;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-22 22:22
 */
public interface Collage {

    void add(Dept dept);

    Iterator<Dept> createIterator();

}