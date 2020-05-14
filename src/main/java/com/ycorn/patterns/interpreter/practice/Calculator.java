package com.ycorn.patterns.interpreter.practice;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.stream.Collectors;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/14 14:31
 */

public class Calculator {

    public Expression expression;

    public Calculator(String exp) {
        // 栈 结构保存数据
        Deque<Expression> deque = new LinkedBlockingDeque<>();
        String[] strs = exp.split("");
        List<String> expEle = Arrays.stream(strs).filter(str -> !"".equals(str.trim())).collect(Collectors.toList());
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < expEle.size(); i++) {
            String ele = expEle.get(i);
            switch (ele) {
                case "+":
                    left = deque.pop();
                    right = new VarExpression(expEle.get(++i));
                    deque.push(new AddExpression(left, right));
                    break;
                case "-":
                    left = deque.pop();
                    right = new VarExpression(expEle.get(++i));
                    deque.push(new SubExpression(left, right));
                    break;
                default:
                    deque.push(new VarExpression(ele));
            }
        }
        this.expression = deque.pop();
    }

    public int run(HashMap<String, Integer> var) {
        return expression.interpreter(var);
    }
}
