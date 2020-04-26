package com.ycorn.patterns.factory.abstractfacotry;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/24 18:03
 */

public class AbstractFactoryTest {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        AbstractFactory bjPizzaFactory = new BJPizzaFactory();

        pizzaStore.order(bjPizzaFactory.createPizza("fruit"));
        System.out.println();
        AbstractFactory cqPizzaFactory = new CQPizzaFactory();
        pizzaStore.order(cqPizzaFactory.createPizza("meat"));
    }
}
