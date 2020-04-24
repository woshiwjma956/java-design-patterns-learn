package com.ycorn.patterns.factory.abstractfacotry;

import com.ycorn.patterns.factory.FruitPizza;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/24 18:00
 */

public class BJFruitPizza extends FruitPizza {
    @Override
    public void prepare() {
        printFrom();
        super.prepare();
    }

    @Override
    public void bake() {
        printFrom();
        super.bake();
    }

    @Override
    public void cut() {
        printFrom();
        super.cut();
    }

    @Override
    public void box() {
        printFrom();
        super.box();
    }

    private void printFrom(){
        System.out.println("产地在北京");
    }
}
