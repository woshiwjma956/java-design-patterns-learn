package com.ycorn.patterns.bridge;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/28 15:11
 */

public class BridgeTest {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        MIPhone miPhone = new MIPhone();
        System.out.println("===========================================");
        SmartPhone smartPhone = new SmartPhone(iPhone);
        smartPhone.open();
        smartPhone.call();
        smartPhone.close();
        System.out.println("===========================================");
        SmartPhone smartPhone2 = new SmartPhone(miPhone);
        smartPhone2.open();
        smartPhone2.call();
        smartPhone2.close();
        System.out.println("===========================================");
        OldManPhone oldManPhone = new OldManPhone(miPhone);
        oldManPhone.open();
        oldManPhone.call();
        oldManPhone.close();
        System.out.println("===========================================");
        OldManPhone oldManPhone2 = new OldManPhone(iPhone);
        oldManPhone2.open();
        oldManPhone2.call();
        oldManPhone2.close();
        System.out.println("===========================================");
    }
}
