package com.ycorn.patterns.builder.practice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/24 16:51
 */

public class BuilderDemoTest {

    public static void main(String[] args) {
        BuilderImpl1 builderImpl1 = new BuilderImpl1();
        BuildDirector buildDirector = new BuildDirector(builderImpl1);
        System.out.println(buildDirector.getResult());
    }
}
