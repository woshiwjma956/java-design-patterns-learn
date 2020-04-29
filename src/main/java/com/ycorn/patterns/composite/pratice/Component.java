package com.ycorn.patterns.composite.pratice;

import lombok.Data;

import java.util.List;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/4/29 15:18
 */
@Data
public abstract class Component {

    String name;

    public Component(String name) {
        this.name = name;
    }

    void add(Component component) {
        throw new UnsupportedOperationException();
    }

    void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    List<Component> children() {
        throw new UnsupportedOperationException();
    }

    abstract void print();
}
