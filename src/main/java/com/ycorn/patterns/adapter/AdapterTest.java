package com.ycorn.patterns.adapter;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/28 10:34
 */

public class AdapterTest {

    public static void main(String[] args) {
        Phone phone = new Phone();
        VoltageAdapter voltageAdapter = new VoltageAdapter();
        phone.charge(voltageAdapter);

        // 对象适配器调用
        VoltageAdaptor2 voltageAdaptor2 = new VoltageAdaptor2(new Voltage220V());
        phone.charge(voltageAdaptor2);
    }
}
