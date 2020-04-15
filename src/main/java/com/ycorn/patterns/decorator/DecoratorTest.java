package com.ycorn.patterns.decorator;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-15 23:55
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Drink coffee = new BlackCoffee();
        System.out.println(coffee.getDesp()+coffee.getPrices());
        Milk milk = new Milk(coffee);

        System.out.println(milk.getDesp() + " === " + milk.cost());

        Milk milk2 = new Milk(milk);

        System.out.println(milk2.getDesp() + "=== " + milk2.cost());

        Sugar sugar = new Sugar(milk2);
        System.out.println(sugar.getDesp() + "=== " + sugar.cost());

    }


}