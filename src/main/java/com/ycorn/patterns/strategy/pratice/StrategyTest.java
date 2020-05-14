package com.ycorn.patterns.strategy.pratice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/14 17:35
 */

public class StrategyTest {

    public static void main(String[] args) {
        BiNumberOperation biNumberOperation = new BiNumberOperation(new AddStrategy());
        int addStrategy = biNumberOperation.operation(1, 2);
        System.out.println(addStrategy);
        System.out.println("===========================================");
        biNumberOperation.setStrategy(new SubStrategy());
        int subStrategy = biNumberOperation.operation(1, 2);
        System.out.println(subStrategy);
        System.out.println("===========================================");
        biNumberOperation.setStrategy(new MultipleStrategy());
        int multipleStrategy = biNumberOperation.operation(1, 2);
        System.out.println(multipleStrategy);
    }
}
