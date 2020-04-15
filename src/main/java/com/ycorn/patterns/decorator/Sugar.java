package com.ycorn.patterns.decorator;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-15 23:53
 */
public class Sugar extends Decorator {


    public Sugar(Drink drink) {
        super(drink);
        setDesp(drink.getDesp() + " + sugar ");
        this.setPrices( 1.f);
    }

}