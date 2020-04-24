package com.ycorn.patterns.factory;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/24 17:34
 */

public class SimplePizzaFactory {
    public Pizza create(String pizzaType) {
        switch (pizzaType) {
            case "meat":
                return new MeatPizza();
            case "fruit":
                return new FruitPizza();
            case "cheese":
                return new CheesePizza();
            default:
                return null;
        }
    }
    public void order (String type){
        Pizza pizza = create(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        simplePizzaFactory.order("meat");
        System.out.println("=============");
        simplePizzaFactory.order("fruit");
        System.out.println("=============");
        simplePizzaFactory.order("cheese");
    }
}
