package com.ycorn.patterns.interpreter.practice2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/14 15:18
 */

public class Calc {

    private Expression expression;

    public Calc(String exp) {
        Deque<Expression> deque = new ArrayDeque<>();
        String[] strs = exp.split("");
        List<String> expEle = Arrays.stream(strs).filter(str -> !"".equals(str.trim())).collect(Collectors.toList());

        Expression left = null;
        Expression right = null;

        for (int i = 0; i < expEle.size(); i++) {
            String ele = expEle.get(i);
            switch (ele) {
                case "+":
                    left = deque.pop();
                    right = new VarExpression(Integer.valueOf(expEle.get(++i)));
                    deque.push(new AddExpression(left, right));
                    break;
                case "-":
                    left = deque.pop();
                    right = new VarExpression(Integer.valueOf(expEle.get(++i)));
                    deque.push(new SubExpression(left, right));
                    break;
                default:
                    deque.push(new VarExpression(Integer.valueOf(ele)));
            }
        }
        expression = deque.pop();
    }

    public int run(Deque<Integer> integerDeque) {
        return expression.interpreter(integerDeque);
    }
}
