package com.ycorn.patterns.state;

/**
 * 描述:
 * 奖品发完状态
 *
 * @author JimWu
 * @create 2020-04-26 23:30
 */
public class DepleteState extends AbstractState {

    private RaffleActivity raffleActivity;

    public DepleteState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void dispense() {
        System.out.println("奖品已经全部发完了不能发放");
        raffleActivity.setCurrentState(raffleActivity.depleteState);
    }

    @Override
    public void deduce() {
        System.out.println("奖品已经全部发完了不能扣积分");

    }

    @Override
    public void raffle() {
        System.out.println("奖品已经全部发完了不能抽奖");

    }
}