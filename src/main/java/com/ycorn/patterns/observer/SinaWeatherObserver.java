package com.ycorn.patterns.observer;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-23 22:53
 */
public class SinaWeatherObserver implements Observer {

    private float temperature;
    private float pressure;

    @Override
    public void update(float temperature, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.display();
    }
    public void display(){
        System.out.println("Sina temperature " + temperature);
        System.out.println("Sina pressure " + pressure);
    }
}