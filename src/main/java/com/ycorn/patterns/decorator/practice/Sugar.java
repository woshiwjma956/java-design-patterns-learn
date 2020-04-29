package com.ycorn.patterns.decorator.practice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/29 11:18
 */

public class Sugar extends Decorator {

    public Sugar(Seasoning seasoning) {
        super("糖", 0.5f, seasoning);
    }

}
