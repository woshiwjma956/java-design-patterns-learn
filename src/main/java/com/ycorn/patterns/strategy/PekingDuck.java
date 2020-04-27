package com.ycorn.patterns.strategy;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-27 23:13
 */
public class PekingDuck extends Duck {


    public PekingDuck(String name) {
        super(name);
        super.flyBehavior = new NoFlyBehavior();
    }

}