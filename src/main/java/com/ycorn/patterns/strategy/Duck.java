package com.ycorn.patterns.strategy;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-27 23:09
 */
public abstract class Duck {

    private final String name;

    FlyBehavior flyBehavior;

    QuackerBehavior quackerBehavior;

    public Duck(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("我是" + name);
    }

    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    public void quacker() {
        if (quackerBehavior != null) {
            quackerBehavior.quacker();
        }
    }

    public void run(){
        this.display();
        this.fly();
        this.quacker();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}