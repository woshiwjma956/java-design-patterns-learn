package com.ycorn.patterns.mediator;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/13 17:55
 */

public class ColleagueA extends Colleague {

    private Mediator mediator;

    public ColleagueA(String name) {
        super(name);
    }

    @Override
    void setMediator(Mediator mediator) {
        this.mediator = mediator;
        mediator.registry(this);
    }

    @Override
    void sendMsg(String msg) {
        this.mediator.getMessage(this, msg);
    }
}
