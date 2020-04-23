package com.ycorn.patterns.observer;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-23 22:49
 */
public interface Subject {

    void register(Observer observer);

    void remove(Observer observer);

    void notifyObserver();


}