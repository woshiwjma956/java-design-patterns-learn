package com.ycorn.patterns.facade;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/29 16:56
 */

public class Stereo {
    public void open() {
        System.out.println("Stereo is open");
    }

    public void close() {
        System.out.println("Stereo is close");
    }
   private static class InstanceHolder {
        private static Stereo INSTANCE = new Stereo();
    }

    public static Stereo getInstance() {
        return Stereo.InstanceHolder.INSTANCE;
    }
}
