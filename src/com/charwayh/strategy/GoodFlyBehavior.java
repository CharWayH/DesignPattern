package com.charwayh.strategy;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.strategy
 * @date:2023/5/29
 */
public class GoodFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞翔技术高超...");
    }
}
