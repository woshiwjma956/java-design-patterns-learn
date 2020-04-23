package com.ycorn.patterns.builder;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/23 18:02
 */

public class BuilderDemoTest {

    public static void main(String[] args) {
        House highHouse = new HouseDirector(new HighHouseBuilder()).constructHouse();
        System.out.println(highHouse);
        System.out.println("===========");
        House commonHouse = new HouseDirector(new CommonHouseBuilder()).constructHouse();
        System.out.println(commonHouse);
    }

}
