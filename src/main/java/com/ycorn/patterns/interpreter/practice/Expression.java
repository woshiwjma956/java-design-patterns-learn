package com.ycorn.patterns.interpreter.practice;

import java.util.HashMap;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/14 11:55
 */

public interface Expression {

    int interpreter(HashMap<String, Integer> var);
}
