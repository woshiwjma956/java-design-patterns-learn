package com.ycorn.patterns.vistor;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-22 22:55
 */
public class Woman extends Person {

    @Override
    void accept(Action action) {
        action.getWomenResult(this);
    }
}