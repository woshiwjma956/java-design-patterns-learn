package com.ycorn.patterns.observer.pratices;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/13 16:23
 */

public class SinaWeatherObserver implements Observer {
    private float temperature;

    private float pressure;

    @Override
    public void update(float temperature, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        System.out.println(String.format("新浪天气更新气温%.2f,气压%.2f", temperature, pressure));
    }
}
