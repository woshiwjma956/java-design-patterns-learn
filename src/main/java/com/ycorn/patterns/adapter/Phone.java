package com.ycorn.patterns.adapter;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/28 10:33
 */

public class Phone {

    void charge(Voltage5V voltage5V) {
        if (voltage5V.output5V() == 5) {
            System.out.println("电压符合正在充电");
        } else {
            System.out.println("电压不符不能充电");
        }
    }
}
