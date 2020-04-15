package com.ycorn.patterns.decorator;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-15 23:50
 */
public abstract class Decorator extends Drink {

    protected Drink drink;


    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return drink.cost() + this.getPrices();
    }
}