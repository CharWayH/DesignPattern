package com.charwayh.strategy.common;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.strategy
 * @date:2023/5/29
 * 北京鸭无法飞翔
 */
public class PekingDuck extends Duck{
    @Override
    public void disPlay() {
        System.out.println("这是一只北京鸭");
    }

    // 因为北京鸭不能飞翔，因此要重写fly

    @Override
    public void fly() {
        System.out.println("飞得很烂...");
    }
}
