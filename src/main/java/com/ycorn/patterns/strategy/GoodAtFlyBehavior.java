package com.ycorn.patterns.strategy;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-27 23:14
 */
public class GoodAtFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println(" good at fly");
    }
}