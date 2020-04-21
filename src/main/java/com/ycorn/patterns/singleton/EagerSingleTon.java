package com.ycorn.patterns.singleton;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-21 23:06
 */
public class EagerSingleTon {

    private EagerSingleTon() {
    }

    private static EagerSingleTon INSTANCE = new EagerSingleTon();

    public static EagerSingleTon getInstance() {
        return INSTANCE;
    }

}