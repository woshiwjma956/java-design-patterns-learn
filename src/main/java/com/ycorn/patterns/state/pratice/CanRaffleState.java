package com.ycorn.patterns.state.pratice;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/14 16:19
 */

public class CanRaffleState extends AbstractState {

    public CanRaffleState(RaffleActivity raffleActivity) {
        super(raffleActivity);
    }

    @Override
    public void raffle() {
        int random = ThreadLocalRandom.current().nextInt(10);
        if (random == 0) {
            System.out.println(" 恭喜抽中了! ");
            raffleActivity.setCurrentState(raffleActivity.dispenseState);
        } else {
            System.out.println(" 没有抽中..");
            raffleActivity.setCurrentState(raffleActivity.canRaffleState);
        }
    }

}
