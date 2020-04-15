package com.ycorn.patterns.decorator;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-15 23:45
 */
public abstract class Coffee extends Drink {

    private float prices;

    public float getPrices() {
        return prices;
    }

    public void setPrices(float prices) {
        this.prices = prices;
    }

    public float cost() {
        return this.prices;
    }
}