package com.ycorn.patterns.template;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/8 15:09
 */

public class PureMike extends MikeMaker{


    @Override
    public void addFlavouring() {
        System.out.println("纯牛奶什么都不加..可以一个空实现");
    }
}
