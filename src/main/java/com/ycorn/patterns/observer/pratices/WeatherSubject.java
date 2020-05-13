package com.ycorn.patterns.observer.pratices;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/13 16:20
 */

public class WeatherSubject implements Subject {
    private float temperature = 26.5f;

    private float pressure = 30f;

    List<Observer> observerList;

    public WeatherSubject() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    public void changeData(float temperature, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(this.temperature, this.pressure);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observerList.contains(observer)) {
            observerList.remove(observer);
            return;
        }
        throw new NoSuchElementException();
    }
}
