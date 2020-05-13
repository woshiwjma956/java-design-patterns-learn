package com.ycorn.patterns.mediator;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/13 17:57
 */

public class MediatorTest {

    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();

        ColleagueA colleagueA = new ColleagueA("ColleagueA");
        colleagueA.setMediator(concreteMediator);
        ColleagueB colleagueB = new ColleagueB("ColleagueB");
        colleagueB.setMediator(concreteMediator);

        colleagueA.sendMsg(" i am A send a msg");
        colleagueB.sendMsg(" i am B send a msg");

    }
}
