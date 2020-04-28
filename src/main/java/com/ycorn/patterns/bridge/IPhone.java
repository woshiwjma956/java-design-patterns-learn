package com.ycorn.patterns.bridge;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/28 15:09
 */

public class IPhone implements Brand {
    @Override
    public void open() {
        System.out.println("IPhone 开机");
    }

    @Override
    public void call() {
        System.out.println("IPhone 打电话");
    }

    @Override
    public void close() {
        System.out.println("IPhone 关机");
    }
}
