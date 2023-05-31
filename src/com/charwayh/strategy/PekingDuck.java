package com.charwayh.strategy;

import com.charwayh.strategy.Duck;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.strategy
 * @date:2023/5/29
 * 北京鸭无法飞翔
 */
public class PekingDuck extends Duck {
    @Override
    public void disPlay() {
        System.out.println("这是一只北京鸭");
    }

    public PekingDuck(){
        flyBehavior = new BadFlyBehavior();
    }



}
