package com.ycorn.patterns.bridge;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/28 15:10
 */

public class SmartPhone extends Phone {
    public SmartPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("Smart Phone");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("Smart Phone");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("Smart Phone");
    }
}
