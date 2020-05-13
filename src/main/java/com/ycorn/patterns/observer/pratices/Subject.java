package com.ycorn.patterns.observer.pratices;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/13 16:18
 */

public interface Subject {

    void registerObserver(Observer observer);

    void notifyObserver();

    void removeObserver(Observer observer);

}
