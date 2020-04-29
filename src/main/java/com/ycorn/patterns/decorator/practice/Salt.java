package com.ycorn.patterns.decorator.practice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/29 11:19
 */

public class Salt extends Decorator {

    public Salt(Seasoning seasoning) {
        super("盐", 0.8f, seasoning);
    }

}
