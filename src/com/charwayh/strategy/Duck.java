package com.charwayh.strategy;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.strategy
 * @date:2023/5/29
 */
public abstract class Duck {
    /**
     * 属性，策略接口
     */
    FlyBehavior flyBehavior;

    public void fly(){
        if(flyBehavior != null){
            flyBehavior.fly();
        }
    }

    abstract void disPlay();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
