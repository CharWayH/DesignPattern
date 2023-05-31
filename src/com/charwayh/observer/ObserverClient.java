package com.charwayh.observer;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.observer
 * @date:2023/5/29
 */
public class ObserverClient {
    public static void main(String[] args) {
        // 创建一个WeatherData
        WeatherData weatherData = new WeatherData();
        // 创建观察者1
        CurrentConditions currentConditions = new CurrentConditions();
        // 穿件观察者2
        BaiduSite baiduSite = new BaiduSite();
        // 注册到weatherData中
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);

        // 测试
        System.out.println("通知各个注册的观察者");

        // 更新数据
        weatherData.setData(10,100,30.3f);

        System.out.println("======移除======");
        // 移除
        weatherData.removeObserver(currentConditions);

        // 更新数据
        weatherData.setData(10,100,30.3f);
    }

}
