package com.ycorn.patterns.decorator.practice;

import lombok.Data;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function : 芝麻油
 * @since : 2020/4/29 11:14
 */
public class SesameOil extends Seasoning {

    public SesameOil(String name, float weight) {
        super(name, weight);
    }

    @Override
    public float totalWeight() {
        return this.getWeight();
    }

}
