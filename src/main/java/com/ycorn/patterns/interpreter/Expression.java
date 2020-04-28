package com.ycorn.patterns.interpreter;

import java.util.HashMap;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/26 11:38
 */

public interface Expression {
    int interpreter(HashMap<String, Integer> var);
}
