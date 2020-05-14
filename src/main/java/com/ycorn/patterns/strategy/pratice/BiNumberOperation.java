package com.ycorn.patterns.strategy.pratice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/14 17:33
 */

public class BiNumberOperation {

    Strategy strategy;

    public BiNumberOperation(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public int operation(int a, int b) {
        if (strategy != null) {
            return strategy.operation(a, b);
        }
        return 0;
    }
}
