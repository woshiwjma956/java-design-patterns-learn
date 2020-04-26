package com.ycorn.patterns.memento;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-25 22:56
 */
public class MementoTest {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Original original = new Original();
        original.setState("init state");
        System.out.println(original);

        careTaker.add(original.saveMemento());

        original.setState("state 2 ");
        System.out.println(original);

        original.setState("state 3");

        System.out.println(original);

        // 回退到最初状态
        original.rollback(careTaker.get(0));

        System.out.println(original);
    }

}