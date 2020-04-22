package com.ycorn.patterns.vistor;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-22 22:54
 */
public class Man extends Person {

    @Override
    void accept(Action action) {
        action.getManResult(this);
    }
}