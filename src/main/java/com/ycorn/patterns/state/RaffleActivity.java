package com.ycorn.patterns.state;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-26 23:25
 */
public class RaffleActivity {

    private State currentState;

    protected int count;

    protected State noRaffleState = new NoRaffleState(this);
    protected State dispenseState = new DispenseState(this);
    protected State canRaffleState = new CanRaffleState(this);
    protected State depleteState = new DepleteState(this);

    public RaffleActivity(int count) {
        this.currentState = this.noRaffleState;
        this.count = count;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void play(){
        currentState.deduce();
        currentState.raffle();
        currentState.dispense();
    }
}