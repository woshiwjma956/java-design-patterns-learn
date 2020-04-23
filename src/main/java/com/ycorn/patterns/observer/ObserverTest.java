package com.ycorn.patterns.observer;

/**
 * 描述:
 *
 * @author JimWu
 * @create 2020-04-23 23:00
 */
public class ObserverTest {

    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        SinaWeatherObserver sinaWeatherObserver = new SinaWeatherObserver();
        weatherSubject.register(sinaWeatherObserver);

        weatherSubject.push(10f,20f);

        System.out.println("===========update =============");
        weatherSubject.push(20f,30f);

        weatherSubject.register(new Observer() {
            @Override
            public void update(float temperature, float pressure) {
                System.out.println("new Observer temperature" + temperature);
                System.out.println("new Observer presure" + pressure);
            }
        });
        System.out.println("===========update =============");
        weatherSubject.push(40f,50f);

    }

}