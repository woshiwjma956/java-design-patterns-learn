package com.ycorn.patterns.vistor;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-22 22:57
 */
public class VisitorPatternTest {

    public static void main(String[] args) {
        Woman woman = new Woman();
        Woman woman2 = new Woman();
        Man man = new Man();
        DataStructure dataStructure = new DataStructure();
        dataStructure.attach(woman);
        dataStructure.attach(woman2);
        dataStructure.attach(man);
        SuccessAction successAction = new SuccessAction();
        dataStructure.display(successAction);
        System.out.println("================");
        FailAction failAction = new FailAction();
        dataStructure.display(failAction);
        System.out.println("================");
        WaitAction waitAction = new WaitAction();
        dataStructure.display(waitAction);
    }

}