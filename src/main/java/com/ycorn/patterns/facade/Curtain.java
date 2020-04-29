package com.ycorn.patterns.facade;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/29 16:56
 */

public class Curtain {

    public void up() {
        System.out.println("Curtain is up");
    }

    public void down() {
        System.out.println("Curtain is down");
    }

    private static class InstanceHolder {
        private static Curtain INSTANCE = new Curtain();
    }

    public static Curtain getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
