package com.ycorn.patterns.builder;


//指挥者，这里去指定制作流程，返回产品
public class HouseDirector {

    AbstractHouseBuilder houseBuilder = null;

    //构造器传入 houseBuilder
    public HouseDirector(AbstractHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }


    //如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.buildFinish();
        return houseBuilder.build();
    }


}
