package com.ycorn.patterns.factory.abstractfacotry;

import com.ycorn.patterns.factory.Pizza;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/26 9:37
 */

public class PizzaStore {

    void order(Pizza pizza){
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
