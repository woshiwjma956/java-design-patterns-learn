package com.ycorn.patterns.iterator.practice;

import java.util.Iterator;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/12 17:36
 */

public interface Collage {

    void add(Dept dept);

    Iterator createIterator();
}
