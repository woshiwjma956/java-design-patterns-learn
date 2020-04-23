package com.ycorn.patterns.builder;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/23 17:57
 */

public class HighHouseBuilder extends AbstractHouseBuilder {

    void buildBasic() {
        super.house.setBasic("High Basic");
        System.out.println("High House basic");
    }

    void buildWall() {
        super.house.setWall("High wall");

        System.out.println("High House wall");

    }

    void buildFinish() {
        super.house.setFinish("High FINISH");
        System.out.println("High House finish");
    }
}
