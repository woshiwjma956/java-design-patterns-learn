package com.ycorn.patterns.proxy.cglib;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-21 22:45
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        CglibProxyClass cglibProxyClass = new CglibProxyClass();
        CglibProxyFactory proxyFactory = new CglibProxyFactory(cglibProxyClass);
        CglibProxyClass proxyClass = (CglibProxyClass) proxyFactory.getProxy();
        String world = proxyClass.hello("world");
        System.out.println(world);
    }

}