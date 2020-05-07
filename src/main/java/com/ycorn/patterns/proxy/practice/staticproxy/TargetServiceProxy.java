package com.atguigu.proxy.practice.staticproxy;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/7 17:14
 */

public class TargetServiceProxy {

    private TargetService targetService;

    public TargetServiceProxy(TargetService targetService) {
        this.targetService = targetService;
    }

    void doSomething() {
        System.out.println("before proxy do something ");
        targetService.doSomething();
        System.out.println("after proxy do something ");
    }

}
