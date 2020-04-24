package com.ycorn.patterns.factory;

public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("开始准备芝士披萨");
    }

    @Override
    public void bake() {
        System.out.println("开始烘焙芝士披萨");
    }

    @Override
    public void cut() {
        System.out.println("开始将芝士披萨分块");
    }

    @Override
    public void box() {
        System.out.println("开始打包芝士披萨");
    }

}