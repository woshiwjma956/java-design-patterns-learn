package com.ycorn.patterns.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-21 22:19
 */
public class ProxyFactory {

    private final Object object;

    public ProxyFactory(Object object) {
        this.object = object;
    }

    public Object getProxy() {
        /**
         * params1: ClassLoader
         * params2: 被代理对象所有实现的接口
         * params3: 代理接口的处理器,在里面实现被代理对象的增加
         */
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println(" proxy before action");
            Object result = method.invoke(object, args);
            System.out.println("proxy after action");
            return result;
        });
    }
}