package com.ycorn.patterns.strategy;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-27 23:15
 */
public class GagaQuackerBehavior implements QuackerBehavior {

    @Override
    public void quacker() {
        System.out.println("gaga gaga");
    }
}