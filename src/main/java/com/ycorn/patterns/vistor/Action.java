package com.ycorn.patterns.vistor;


/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-22 22:52
 */
public interface Action {

    void getManResult(Man man);

    void getWomenResult(Woman woman);
}