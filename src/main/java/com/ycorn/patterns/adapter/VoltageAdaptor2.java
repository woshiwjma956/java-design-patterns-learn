package com.ycorn.patterns.adapter;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/28 10:29
 */

public class VoltageAdaptor2 implements Voltage5V {

    private Voltage220V voltage220V; // 聚合关系


    public VoltageAdaptor2(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }


    public int output5V() {
        int standard = voltage220V.output220V();
        System.out.println("返回从220V转换到5V的电压");
        return standard - 215;
    }
}
