package com.ycorn.patterns.state.pratice;


/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/14 16:29
 */

public class StateTest {

    public static void main(String[] args) {
        RaffleActivity raffleActivity = new RaffleActivity(1);
        for (int i = 0; i < 300; i++) {
            System.out.println("======第" + i + "次抽奖========");
            raffleActivity.play();
            System.out.println("==============");
        }
    }

}
