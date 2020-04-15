package com.ycorn.patterns.decorator;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-15 23:44
 */
public abstract class Drink {

    private String desp;

    private float prices;

    public float getPrices() {
        return prices;
    }

    public void setPrices(float prices) {
        this.prices = prices;
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }

    public abstract float cost();
}