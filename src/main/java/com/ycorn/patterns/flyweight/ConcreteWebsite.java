package com.ycorn.patterns.flyweight;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/30 10:43
 */

public class ConcreteWebsite extends Website {
    private String type;

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类:" + type + "用户名:" + user.getName());
    }
}
