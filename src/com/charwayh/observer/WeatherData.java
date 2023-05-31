package com.charwayh.observer;

import com.charwayh.observer.common.CurrentConditions;

import java.util.ArrayList;

/**
 * @author: create by CharwayH
 * @description: 天气数据类
 * @date:2023/5/29
 * 1.包含最新的天气情况
 * 2.含有 观察者集合 ，使用ArrayList管理。通知所有的接入方，让他们看到最新的消息
 * 3.当数据更新时，就调用CurrentConditions对象的updat方法(内含display)，这样就能看到最新的信息
 */
public class WeatherData implements Subject {
    /**
     * 温度，气压，湿度
     */
    private float temperature;
    private float pressure;
    private float humidity;

    // 观察者集合
    private ArrayList<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

//    /**
//     * 更新天气情况。相当于是推送
//     */
//    public void dataChange(){
//        // 调用currentConditions的更新方法，更新currentConditions中的数据
////        currentConditions.update(getTemperature(), getPressure(), getHumidity());
//    }


    /**
     * 当数据更新时，就调用setData,更新自身数据。然后调用dataChange()
     */
    public void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 将最新的信息推送给所有观察者
        notifyObservers();
    }

    /**
     * 注册一个观察者
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 移除一个观察者
     */
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    /**
     * 遍历所有观察者并通知
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.temperature, this.pressure, this.humidity);
        }
    }
}
