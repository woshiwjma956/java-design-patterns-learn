package com.ycorn.patterns.vistor;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-22 22:56
 */
public class FailAction implements Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("Man is fail");
    }

    @Override
    public void getWomenResult(Woman woman) {
        System.out.println("Woman is fails");
    }
}