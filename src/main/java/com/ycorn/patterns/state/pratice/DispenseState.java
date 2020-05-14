package com.ycorn.patterns.state.pratice;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/14 16:27
 */

public class DispenseState extends AbstractState {

    public DispenseState(RaffleActivity raffleActivity) {
        super(raffleActivity);
    }


    @Override
    public void dispense() {
        int remind = --raffleActivity.count;
        if (remind < 0) {
            System.out.println("奖品已经发完了");
            raffleActivity.setCurrentState(raffleActivity.noRaffleState);
        } else {
            System.out.println("领取奖品.!");
            raffleActivity.setCurrentState(raffleActivity.canRaffleState);
        }
    }
}
