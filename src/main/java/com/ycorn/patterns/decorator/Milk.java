package com.ycorn.patterns.decorator;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-15 23:53
 */
public class Milk extends Decorator {


    public Milk(Drink drink) {
        super(drink);
        setDesp(drink.getDesp()+" + milk ");
        this.setPrices(2.f);
    }

}