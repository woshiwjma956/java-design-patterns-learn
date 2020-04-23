package com.ycorn.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-23 22:50
 */
public class WeatherSubject implements Subject {

    private float temperature;

    private float pressure;

    private List<Observer> observers;

    public WeatherSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        if (observers.contains(observer))
            observers.remove(observer);
    }

    public void push(float temperature, float pressure) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.notifyObserver();
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(this.temperature, this.pressure));
    }
}