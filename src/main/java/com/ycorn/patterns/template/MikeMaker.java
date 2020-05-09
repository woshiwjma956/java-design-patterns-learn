package com.ycorn.patterns.template;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/8 15:06
 */

public abstract class MikeMaker {

    public final void makeMike() {
        disinfect();
        addFlavouring();
        mixing();
        box();
    }

    public void disinfect() {
        System.out.println("牛奶消毒");
    }

    /**
     * 添加备料
     */
    public abstract void addFlavouring();

    public void mixing() {
        System.out.println("搅拌备料");
    }

    public void box() {
        System.out.println("打包调配好的牛奶");
    }
}
