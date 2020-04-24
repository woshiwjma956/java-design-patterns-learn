package com.ycorn.patterns.builder.practice;

import com.ycorn.patterns.builder.House;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/24 16:48
 */

public class BuilderImpl1 extends AbstractBuilder {
    @Override
    public void step1() {
        System.out.println("Impl1 step1");
        product.setStep1("Impl1 step1");
    }

    @Override
    public void step2() {
        System.out.println("Impl1 step2");
        product.setStep2("Impl1 step2");

    }

    @Override
    public void step3() {
        System.out.println("Impl1 step3");
        product.setStep3("Impl1 step3");

    }
}
