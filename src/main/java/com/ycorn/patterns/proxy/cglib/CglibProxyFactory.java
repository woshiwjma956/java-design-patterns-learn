package com.ycorn.patterns.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-21 22:42
 */
public class CglibProxyFactory implements MethodInterceptor {

    public final Object object;

    public CglibProxyFactory(Object object) {
        this.object = object;
    }

    public Object getProxy(){
        // 创建一个Enhancer加强工具类
        Enhancer enhancer = new Enhancer();
        // 设置被代理对象的父类
        enhancer.setSuperclass(object.getClass());
        // 设置回调函数 CallBack接口的子类, 这里我们自己实现MethodInterceptor传入即可
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    /**
     * 重写  intercept 方法，会调用目标对象的方法
     * @param o  "this", the enhanced object enhanced对象本身 别用..
     * @param method 被代理对象当前执行的方法
     * @param args 被代理对象传入的参数
     * @param methodProxy used to invoke super (non-intercepted method); may be called
     *      * as many times as needed 用于执行父类未被拦截的方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //System.out.println("Object " + o);
        System.out.println("Method Proxy " + methodProxy);
        System.out.println("cglib before proxy");
        Object result = method.invoke(object,args);
        System.out.println("cglib after proxy");
        return result;
    }
}