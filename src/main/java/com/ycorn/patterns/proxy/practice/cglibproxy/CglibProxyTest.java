package com.ycorn.patterns.proxy.practice.cglibproxy;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/7 17:31
 */

public class CglibProxyTest {

    public static void main(String[] args) {
        TargetClass proxy = (TargetClass) new CglibProxyFactory(new TargetClass()).getProxy();
        proxy.doSomething();
    }
}
