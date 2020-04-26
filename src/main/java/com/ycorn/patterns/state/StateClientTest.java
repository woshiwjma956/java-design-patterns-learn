package com.ycorn.patterns.state;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-26 23:52
 */
public class StateClientTest {

    public static void main(String[] args) {
        RaffleActivity raffleActivity = new RaffleActivity(1);
        for (int i = 0; i < 300; i++) {
            System.out.println("======第" + i + "次抽奖========");
            raffleActivity.play();
            System.out.println("==============");
        }
    }

}