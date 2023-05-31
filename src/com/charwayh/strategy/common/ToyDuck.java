package com.charwayh.strategy.common;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.strategy
 * @date:2023/5/29
 * 玩具鸭不能叫不能游泳不用飞翔
 */
public class ToyDuck extends Duck{
    @Override
    public void disPlay() {
        System.out.println("这是一只玩具鸭~");
    }

    @Override
    public void quack() {
        System.out.println("玩具鸭不会叫~");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭不能飞翔~");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不能游泳~");
    }
}
