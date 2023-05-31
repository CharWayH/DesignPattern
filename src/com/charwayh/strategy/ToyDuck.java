package com.charwayh.strategy;

import com.charwayh.strategy.Duck;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.strategy
 * @date:2023/5/29
 * 玩具鸭不能叫不能游泳不用飞翔
 */
public class ToyDuck extends Duck {
    @Override
    public void disPlay() {
        System.out.println("这是一只玩具鸭~");
    }

    public ToyDuck(){
        flyBehavior = new NoFlyBehavior();
    }


}
