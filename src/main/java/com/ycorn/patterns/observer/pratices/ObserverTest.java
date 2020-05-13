package com.ycorn.patterns.observer.pratices;

/**
 * @author : Jim Wu
 * @version 1.0
 * @function :
 * @since : 2020/5/13 16:29
 */

public class ObserverTest {

    public static void main(String[] args) {
        // 气象站
        WeatherSubject weatherSubject = new WeatherSubject();
        // 百度天气
        BaiduWeatherObserver baiduWeatherObserver = new BaiduWeatherObserver();
        // 新浪天气
        SinaWeatherObserver sinaWeatherObserver = new SinaWeatherObserver();

        weatherSubject.registerObserver(baiduWeatherObserver);
        weatherSubject.registerObserver(sinaWeatherObserver);

        weatherSubject.changeData(25.f, 21f);

        System.out.println("===========================================");
        weatherSubject.removeObserver(sinaWeatherObserver);
        weatherSubject.changeData(23.f, 66f);

    }
}
