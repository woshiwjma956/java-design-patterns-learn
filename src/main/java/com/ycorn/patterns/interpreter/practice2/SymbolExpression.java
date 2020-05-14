package com.ycorn.patterns.interpreter.practice2;

import java.util.Deque;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/14 15:16
 */

public class SymbolExpression implements Expression {
    Expression left;

    Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Deque<Integer> vars) {
        return 0;
    }
}
