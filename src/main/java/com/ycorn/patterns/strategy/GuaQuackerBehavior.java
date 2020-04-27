package com.ycorn.patterns.strategy;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-27 23:16
 */
public class GuaQuackerBehavior implements QuackerBehavior {

    @Override
    public void quacker() {
        System.out.println("gua gua ");
    }
}