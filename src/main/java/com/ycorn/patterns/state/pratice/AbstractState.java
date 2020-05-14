package com.ycorn.patterns.state.pratice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/14 16:18
 */

public class AbstractState implements State {
    RaffleActivity raffleActivity;

    public AbstractState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deduce() {

    }

    @Override
    public void raffle() {

    }

    @Override
    public void dispense() {

    }
}
