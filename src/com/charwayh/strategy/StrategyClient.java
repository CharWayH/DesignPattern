package com.charwayh.strategy;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.strategy
 * @date:2023/5/29
 */
public class StrategyClient {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();
        // 认为北京鸭真的不能飞
        pekingDuck.setFlyBehavior(new NoFlyBehavior());
        pekingDuck.fly();
    }
}
