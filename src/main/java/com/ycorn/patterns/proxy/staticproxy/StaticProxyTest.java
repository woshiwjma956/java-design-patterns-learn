package com.ycorn.patterns.proxy.staticproxy;

/**
 * 描述: 静态代理
 *
 * @author JimWu
 * @create 2020-04-21 22:39
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        StaticProxyInterface staticProxyInterface = () -> {
            System.out.println("real do something");
        };
        StaticProxyFactory proxyFactory = new StaticProxyFactory(staticProxyInterface);
        proxyFactory.doSomething();
    }

}