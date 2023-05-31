package com.charwayh.strategy.common;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.strategy
 * @date:2023/5/29
 */
public abstract class Duck {
    public Duck(){
    }

    public void quack(){
        System.out.println("鸭子嘎嘎叫~");
    }

    public void swim(){
        System.out.println("鸭子会游泳~");
    }

    public void fly(){
        System.out.println("鸭子会飞翔~");
    }

    /**
     * 显示鸭子信息
     */
    public abstract void disPlay();


}
