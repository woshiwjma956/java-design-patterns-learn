package com.ycorn.patterns.state.pratice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/14 16:21
 */

public class NoRaffleState extends AbstractState{

    public NoRaffleState(RaffleActivity raffleActivity) {
        super(raffleActivity);
    }

    @Override
    public void deduce() {
        System.out.println("当前已经不能抽奖了...");
        raffleActivity.setCurrentState(raffleActivity.noRaffleState);
    }

}
