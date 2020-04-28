package com.ycorn.patterns.interpreter;

import java.util.HashMap;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/26 11:38
 */

public class VarExpression implements Expression {
    private String key; // key=a,key=b,key=c

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
