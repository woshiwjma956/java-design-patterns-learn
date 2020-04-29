package com.ycorn.patterns.decorator.practice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/29 11:20
 */

public class Garlic extends Decorator {

    public Garlic(Seasoning seasoning) {
        super("大蒜",0.5f,seasoning);
    }
}
