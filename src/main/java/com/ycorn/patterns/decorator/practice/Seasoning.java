package com.ycorn.patterns.decorator.practice;

import lombok.Data;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/29 11:12
 */

public abstract class Seasoning {
    private String name;

    private float weight;

    public Seasoning(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract float totalWeight();

    public void display() {
        System.out.println(this.getName() + this.totalWeight());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
