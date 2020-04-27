package com.ycorn.patterns.strategy;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-27 23:16
 */
public class StrategyTest {

    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck("wild duck");
        wildDuck.run();

        System.out.println("===========");
        PekingDuck pekingDuck = new PekingDuck("peking duck");
        pekingDuck.run();
        System.out.println("===========");
        System.out.println("change fly behavior");
        pekingDuck.setFlyBehavior(new GoodAtFlyBehavior());
        pekingDuck.run();
    }

}