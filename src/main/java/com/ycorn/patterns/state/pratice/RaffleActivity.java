package com.ycorn.patterns.state.pratice;


import com.ycorn.patterns.state.DepleteState;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/14 16:19
 */

public class RaffleActivity {
    private State currentState;

    protected int count;

    protected State noRaffleState = new NoRaffleState(this);
    protected State dispenseState = new DispenseState(this);
    protected State canRaffleState = new CanRaffleState(this);

    public RaffleActivity(int count) {
        this.currentState = this.canRaffleState;
        this.count = count;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void play() {
        currentState.deduce();
        currentState.raffle();
        currentState.dispense();
    }
}
