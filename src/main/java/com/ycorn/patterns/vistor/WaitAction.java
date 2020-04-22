package com.ycorn.patterns.vistor;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-22 23:03
 */
public class WaitAction implements Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("Man is wait");
    }

    @Override
    public void getWomenResult(Woman woman) {
        System.out.println("Woman is wait");
    }
}