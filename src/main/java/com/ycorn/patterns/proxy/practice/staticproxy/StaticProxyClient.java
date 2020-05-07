package com.atguigu.proxy.practice.staticproxy;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/7 17:15
 */

public class StaticProxyClient {

    public static void main(String[] args) {
        TargetServiceProxy targetServiceProxy = new TargetServiceProxy(new TargetServiceImpl());
        targetServiceProxy.doSomething();
    }
}
