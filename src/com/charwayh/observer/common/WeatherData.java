package com.charwayh.observer.common;

/**
 * @author: create by CharwayH
 * @description: 天气数据类
 * @date:2023/5/29
 * 1.包含最新的天气情况
 * 2.含有CurrentConditions对象
 * 3.当数据更新时，就调用CurrentConditions对象的updat方法(内含display)，这样就能看到最新的信息
 */
public class WeatherData {
    /**
     * 温度，气压，湿度
     */
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;
    public WeatherData(CurrentConditions currentConditions){
        this.currentConditions = currentConditions;
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

    /**
     * 更新天气情况。相当于是推送
     */
    public void dataChange(){
        // 调用currentConditions的更新方法，更新currentConditions中的数据
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
    }


    /**
     * 当数据更新时，就调用setData,更新自身数据。然后调用dataChange()
     */
    public void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 将最新的信息推送给CurrentConditions
        dataChange();
    }
}
