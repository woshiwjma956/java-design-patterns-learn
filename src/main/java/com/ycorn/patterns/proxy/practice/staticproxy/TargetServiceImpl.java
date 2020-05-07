package com.atguigu.proxy.practice.staticproxy;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/7 17:14
 */

public class TargetServiceImpl implements TargetService {
    @Override
    public void doSomething() {
        System.out.println("target Class do something");
    }
}
