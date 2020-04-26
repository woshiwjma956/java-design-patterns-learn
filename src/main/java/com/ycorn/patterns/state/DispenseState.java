package com.ycorn.patterns.state;

/**
 * 描述:
 * 发放奖品状态
 *
 * @author JimWu
 * @create 2020-04-26 23:29
 */
public class DispenseState extends AbstractState {

    private RaffleActivity raffleActivity;

    public DispenseState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }


    @Override
    public void dispense() {
        int remind = --raffleActivity.count;
        if (remind < 0) {
            System.out.println("奖品已经发完了");
            raffleActivity.setCurrentState(raffleActivity.depleteState);
        } else {
            System.out.println("领取奖品.!");
            raffleActivity.setCurrentState(raffleActivity.noRaffleState);
        }
    }
}