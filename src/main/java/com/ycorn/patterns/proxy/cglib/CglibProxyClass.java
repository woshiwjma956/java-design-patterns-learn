package com.ycorn.patterns.proxy.cglib;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-21 22:45
 */
public class CglibProxyClass {

    String hello(String name) {
        System.out.println("real action...");
        return name + " hello";
    }

}