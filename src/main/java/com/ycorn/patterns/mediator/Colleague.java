package com.ycorn.patterns.mediator;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/13 17:51
 */

public abstract class Colleague {

    private final String name;

    public Colleague(String name) {
        this.name = name;
    }

    abstract void setMediator(Mediator mediator);

    abstract void sendMsg(String msg);

    public String getName() {
        return name;
    }
}
