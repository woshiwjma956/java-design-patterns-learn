package com.ycorn.patterns.state;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-26 23:29
 */
public class CanRaffleState extends AbstractState {

    private RaffleActivity raffleActivity;

    public CanRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }


    @Override
    public void raffle() {
        int random = ThreadLocalRandom.current().nextInt(10);
        if (random == 0) {
            System.out.println(" 恭喜抽中了! ");
            raffleActivity.setCurrentState(raffleActivity.dispenseState);
        } else {
            System.out.println(" 没有抽中..");
            raffleActivity.setCurrentState(raffleActivity.noRaffleState);
        }
    }

}