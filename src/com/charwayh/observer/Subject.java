package com.charwayh.observer;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.observer
 * @date:2023/5/29
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
