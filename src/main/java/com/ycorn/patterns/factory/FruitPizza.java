package com.ycorn.patterns.factory;

public class FruitPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("开始准备水果披萨");
    }

    @Override
    public void bake() {
        System.out.println("开始烘焙水果披萨");
    }

    @Override
    public void cut() {
        System.out.println("开始将水果披萨分块");
    }

    @Override
    public void box() {
        System.out.println("开始打包水果披萨");
    }

}