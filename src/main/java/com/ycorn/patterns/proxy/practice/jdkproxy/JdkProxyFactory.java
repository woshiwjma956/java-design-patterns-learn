package com.ycorn.patterns.proxy.practice.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/7 17:19
 */

public class JdkProxyFactory {

    private final Object target;

    public JdkProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("before jdk proxy do something");
                        Object result = method.invoke(target, args);
                        System.out.println("after jdk proxy do something");
                        return result;
                    }
                });
    }
}
