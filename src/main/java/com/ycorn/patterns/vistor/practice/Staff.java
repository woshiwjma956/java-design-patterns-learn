package com.ycorn.patterns.vistor.practice;

import lombok.Getter;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/9 17:29
 */
@Getter
public abstract class Staff {

    private final String name;

    private final Integer kpi;


    public Staff(String name) {
        this.name = name;
        this.kpi = ThreadLocalRandom.current().nextInt(10);
    }

    public abstract void accept(Visitor visitor);
}
