package com.ycorn.patterns.bridge;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/28 15:06
 */

public abstract class Phone implements Brand {

    Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open() {
        brand.open();
    }

    public void call() {
        brand.call();
    }

    public void close() {
        brand.close();
    }

}
