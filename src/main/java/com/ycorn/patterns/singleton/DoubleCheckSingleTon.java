package com.ycorn.patterns.singleton;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-21 23:08
 */
public class DoubleCheckSingleTon {
    private  DoubleCheckSingleTon() {
    }

    private static volatile DoubleCheckSingleTon INSTANCE = null;

    public static DoubleCheckSingleTon getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckSingleTon.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckSingleTon();
                }
            }
        }
        return INSTANCE;
    }

}