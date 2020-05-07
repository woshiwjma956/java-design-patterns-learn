package com.ycorn.patterns.proxy.practice.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/7 17:27
 */

public class CglibProxyFactory implements MethodInterceptor {

    private final Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("before cglib proxy ");
        Object result = method.invoke(target, args);
        System.out.println("after cglib proxy ");
        return result;
    }
}
