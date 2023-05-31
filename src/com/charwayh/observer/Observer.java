package com.charwayh.observer;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.observer
 * @date:2023/5/29
 */
public interface Observer {

    public void update(float temperature, float pressure, float humidity);
}
