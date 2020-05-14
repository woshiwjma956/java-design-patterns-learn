package com.ycorn.patterns.strategy.pratice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/14 17:32
 */

public class MultipleStrategy implements Strategy {
    @Override
    public int operation(int a, int b) {
        return a * b;
    }
}
