package com.ycorn.patterns.builder;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/23 17:57
 */

public class CommonHouseBuilder extends AbstractHouseBuilder {

    void buildBasic() {
        super.house.setBasic("COMMON Basic");
        System.out.println("Common House basic");
    }

    void buildWall() {
        super.house.setWall("COMMON wall");

        System.out.println("Common House wall");

    }

    void buildFinish() {
        super.house.setFinish("COMMON FINISH");
        System.out.println("Common House finish");
    }
}
