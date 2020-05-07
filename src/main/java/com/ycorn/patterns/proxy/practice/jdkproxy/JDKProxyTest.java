package com.ycorn.patterns.proxy.practice.jdkproxy;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/7 17:22
 */

public class JDKProxyTest {

    public static void main(String[] args) {
        JdkProxyFactory jdkProxy = new JdkProxyFactory(new TargetService() {
            @Override
            public void doSomething() {
                System.out.println("target Class doSomething");
            }
        });
        // ǿת
        TargetService proxy = (TargetService) jdkProxy.getProxy();
        proxy.doSomething();
    }
}
