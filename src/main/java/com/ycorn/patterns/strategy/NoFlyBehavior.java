package com.ycorn.patterns.strategy;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-27 23:14
 */
public class NoFlyBehavior implements FlyBehavior {


    @Override
    public void fly() {
        System.out.println("Can't fly");
    }
}