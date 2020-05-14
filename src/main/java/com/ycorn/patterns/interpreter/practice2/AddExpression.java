package com.ycorn.patterns.interpreter.practice2;

import java.util.Deque;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/14 15:17
 */

public class AddExpression extends SymbolExpression {


    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Deque<Integer> vars) {
        return left.interpreter(vars) + right.interpreter(vars);
    }
}
