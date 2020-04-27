package com.ycorn.patterns.strategy;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-27 23:15
 */
public class WildDuck extends Duck {

    public WildDuck(String name) {
        super(name);
        flyBehavior = new GoodAtFlyBehavior();
    }
}