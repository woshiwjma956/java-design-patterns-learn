package com.ycorn.patterns.factory;

public class MeatPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("开始准备肉类披萨");
    }

    @Override
    public void bake() {
        System.out.println("开始烘焙肉类披萨");
    }

    @Override
    public void cut() {
        System.out.println("开始将肉类披萨分块");
    }

    @Override
    public void box() {
        System.out.println("开始打包肉类披萨");
    }

}