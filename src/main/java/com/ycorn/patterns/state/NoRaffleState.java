package com.ycorn.patterns.state;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-26 23:25
 */
public class NoRaffleState extends AbstractState {

    private RaffleActivity raffleActivity;

    public NoRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deduce() {
        System.out.println("扣除积分...");
        raffleActivity.setCurrentState(raffleActivity.canRaffleState);
    }

}