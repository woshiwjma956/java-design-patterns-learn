package com.ycorn.patterns.bridge;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/28 15:09
 */

public class MIPhone implements Brand {
    @Override
    public void open() {
        System.out.println("MI 开机");
    }

    @Override
    public void call() {
        System.out.println("MI 打电话");
    }

    @Override
    public void close() {
        System.out.println("MI 关机");
    }
}
