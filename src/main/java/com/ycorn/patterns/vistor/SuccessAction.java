package com.ycorn.patterns.vistor;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-22 22:56
 */
public class SuccessAction implements Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("Man is Success");
    }

    @Override
    public void getWomenResult(Woman woman) {
        System.out.println("Woman is Success");
    }
}