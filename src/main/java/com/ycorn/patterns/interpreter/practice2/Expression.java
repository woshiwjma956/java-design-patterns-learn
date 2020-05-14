package com.ycorn.patterns.interpreter.practice2;

import java.util.Deque;
import java.util.List;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/14 15:14
 */

public interface Expression {

    int interpreter(Deque<Integer> vars);

}
