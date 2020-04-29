package com.ycorn.patterns.decorator.practice;

import lombok.Data;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function : 辅料基础类
 * @since : 2020/4/29 11:16
 */
public abstract class Decorator extends Seasoning {

    private Seasoning seasoning;

    public Decorator(String name, float weight, Seasoning seasoning) {
        super(name, weight);
        this.seasoning = seasoning;
        setName(seasoning.getName() + "+" + name);
    }

    @Override
    public float totalWeight() {
        return seasoning.totalWeight() + this.getWeight();
    }

}
