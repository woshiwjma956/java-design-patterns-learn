package com.ycorn.patterns.builder.practice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/24 16:47
 */

public abstract class AbstractBuilder {

    protected Product product = new Product();

    public abstract void step1();

    public abstract void step2();

    public abstract void step3();

    public Product getResult(){
        return this.product;
    }
}
