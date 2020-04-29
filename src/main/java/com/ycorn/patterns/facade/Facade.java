package com.ycorn.patterns.facade;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/29 16:54
 */

public class Facade {

    private TV tv;
    private Stereo stereo;
    private Curtain curtain;

    public Facade() {
        this.tv = TV.getInstance();
        this.stereo = Stereo.getInstance();
        this.curtain = Curtain.getInstance();
    }

    public void watchTV() {
        tv.open();
        stereo.open();
        curtain.up();
    }

    public void closeTV() {
        tv.close();
        stereo.close();
        curtain.down();
    }
}
