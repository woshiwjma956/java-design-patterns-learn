package com.ycorn.patterns.facade;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/29 16:55
 */

public class TV {

    public void open() {
        System.out.println("TV is open");
    }

    public void close() {
        System.out.println("TV is close");
    }
    private static class InstanceHolder {
        private static TV INSTANCE = new TV();
    }

    public static TV getInstance() {
        return TV.InstanceHolder.INSTANCE;
    }

}
