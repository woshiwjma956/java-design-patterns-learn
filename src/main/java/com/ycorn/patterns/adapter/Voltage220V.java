package com.ycorn.patterns.adapter;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function : 220V 电压 被适配对象
 * @since : 2020/4/28 10:28
 */

public class Voltage220V {

    int output220V() {
        System.out.println("标准220V电压");
        return 220;
    }
}
