package com.ycorn.patterns.proxy.staticproxy;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-21 22:38
 */
public class StaticProxyFactory {

    private final StaticProxyInterface staticProxyInterface;

    public StaticProxyFactory(StaticProxyInterface staticProxyInterface) {
        this.staticProxyInterface = staticProxyInterface;
    }

    public void doSomething(){
        System.out.println("static proxy before");
        staticProxyInterface.doSomething();
        System.out.println("static proxy after");
    }
}