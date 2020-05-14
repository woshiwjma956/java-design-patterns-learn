package com.ycorn.patterns.interpreter.practice2;

import java.util.Deque;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/14 15:14
 */

public class VarExpression implements Expression {

    private Integer val;

    public VarExpression(Integer val) {
        this.val = val;
    }

    @Override
    public int interpreter(Deque<Integer> var) {
        return var.pop();
    }
}
