package com.ycorn.patterns.adapter;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/28 10:29
 */

public class VoltageAdapter extends Voltage220V implements Voltage5V {

    public int output5V() {
        int standard = super.output220V();
        System.out.println("返回从220V转换到5V的电压");
        return standard - 215;
    }
}
