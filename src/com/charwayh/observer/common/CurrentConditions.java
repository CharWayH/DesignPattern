package com.charwayh.observer.common;

/**
 * @author: create by CharwayH
 * @description: 当前天气情况。 可以理解成气象站自己的网站
 * @date:2023/5/29
 */
public class CurrentConditions {
    /**
     * 温度，气压，湿度
     */
    private float temperature;
    private float pressure;
    private float humidity;
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
    private void display() {
        System.out.println("=====今天的温度" + temperature +"=====" );
        System.out.println("=====今天的气压" + pressure +"=====" );
        System.out.println("=====今天的湿度" + humidity +"=====" );
    }
}
