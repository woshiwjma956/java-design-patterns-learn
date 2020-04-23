package com.ycorn.patterns.builder;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/23 17:54
 */

public abstract class AbstractHouseBuilder {
    protected House house = new House();

    abstract void buildBasic();

    abstract void buildWall();

    abstract void buildFinish();

    public House build() {
        return house;
    }

}
