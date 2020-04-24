package com.ycorn.patterns.builder.practice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/24 16:50
 */

public class BuildDirector {


    private AbstractBuilder builder;

    public BuildDirector(AbstractBuilder builder) {
        this.builder = builder;
    }

    public Product getResult() {
        builder.step1();
        builder.step2();
        builder.step3();
        return builder.getResult();
    }
}
