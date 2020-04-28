package com.ycorn.patterns.interpreter;


import java.util.*;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/26 11:47
 */

public class Calculator {

    // 定义表达式
    private Expression expression;


    public Calculator(String exp) {
        Deque<Expression> deque = new ArrayDeque<>();
        char[] chars = exp.toCharArray();
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            switch (c) {
                case '+':
                    left = deque.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    deque.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = deque.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    deque.push(new SubExpression(left, right));
                    break;
                default:
                    deque.push(new VarExpression(String.valueOf(chars[i])));
            }
        }
        // 最终表达式
        this.expression = deque.pop();
    }

    public int run(HashMap<String, Integer> var) {
        return expression.interpreter(var);
    }

}
