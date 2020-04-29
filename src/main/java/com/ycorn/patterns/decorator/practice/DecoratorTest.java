package com.ycorn.patterns.decorator.practice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/29 11:20
 */

public class DecoratorTest {

    public static void main(String[] args) {
        //基础调料
        SesameOil sesameOil = new SesameOil("芝麻油", 1.0f);
        // 加一分盐
        Salt salt = new Salt(sesameOil);
        salt.display();
        // 再加一份盐
        Salt salt2 = new Salt(salt);
        salt2.display();
        // 加一分大蒜
        Garlic garlic = new Garlic(salt2);
        garlic.display();
        // 加一点糖
        Sugar sugar = new Sugar(garlic);
        // 好了可以吃了
        sugar.display();
    }
}
