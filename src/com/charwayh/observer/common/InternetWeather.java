package com.charwayh.observer.common;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.observer
 * @date:2023/5/29
 * 问题:其他第三发给您接入气象站获取数据时需要再WeatherData中新增代码
 * 无法在运行时动态地添加第三方。不利于维护
 * 违反了ocp原则→观察者模式
 *
 */
public class InternetWeather {
    public static void main(String[] args) {
        // 创建接入方currentConditions
        CurrentConditions currentConditions = new CurrentConditions();
        // 创建weatherData并将接入方放入到weatherDate中
        WeatherData weatherData = new WeatherData(currentConditions);
        // 更新天气情况
        weatherData.setData(30,150,40);

        System.out.println("----------------------------");

        // 天气情况发生了变化
        weatherData.setData(25,120,40);

    }
}
