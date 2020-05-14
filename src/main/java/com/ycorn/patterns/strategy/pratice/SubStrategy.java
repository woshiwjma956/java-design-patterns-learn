package com.ycorn.patterns.strategy.pratice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/14 17:31
 */

public class SubStrategy implements Strategy {
    @Override
    public int operation(int a, int b) {
        return a - b;
    }
}
