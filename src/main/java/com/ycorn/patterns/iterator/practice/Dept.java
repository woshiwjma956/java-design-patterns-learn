package com.ycorn.patterns.iterator.practice;

import lombok.Data;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/12 17:17
 */
@Data
public class Dept {
    private final String name;

    public Dept(String name) {
        this.name = name;
    }
}
