package com.ycorn.patterns.bridge;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/28 15:11
 */

public class OldManPhone extends Phone {
    public OldManPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("OldManPhone");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("OldManPhone");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("OldManPhone");
    }
}
