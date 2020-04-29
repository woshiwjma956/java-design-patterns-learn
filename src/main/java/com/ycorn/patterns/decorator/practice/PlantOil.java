package com.ycorn.patterns.decorator.practice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/29 11:15
 */

public class PlantOil extends Seasoning {
    public PlantOil(String name, float weight) {
        super(name, weight);
    }

    @Override
    public float totalWeight() {
        return this.getWeight();
    }
}
