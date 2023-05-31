package com.charwayh.strategy;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.strategy
 * @date:2023/5/29
 */
public class WildDuck extends Duck{
    /**
     * 构造器传入FlyBehavior的对象
     */
    public WildDuck(){
        flyBehavior = new GoodFlyBehavior();
    }


    @Override
    public void disPlay() {
        System.out.println("这是一只野鸭~");
    }
}
