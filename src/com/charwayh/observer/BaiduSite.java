package com.charwayh.observer;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.observer
 * @date:2023/5/29
 * 观察者2
 */
public class BaiduSite implements Observer{
    /**
     * 温度，气压，湿度
     */
    private float temperature;
    private float pressure;
    private float humidity;
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
    private void display() {
        System.out.println("百度天气预报:");
        System.out.println("=====今天的温度" + temperature +"=====" );
        System.out.println("=====今天的气压" + pressure +"=====" );
        System.out.println("=====今天的湿度" + humidity +"=====" );
    }
}
