package com.ycorn.patterns.facade;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/29 17:12
 */

public class FacadeTest {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.watchTV();
        System.out.println("===========================================");
        facade.closeTV();
    }
}
