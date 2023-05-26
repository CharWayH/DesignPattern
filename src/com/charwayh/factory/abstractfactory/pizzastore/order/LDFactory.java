package com.charwayh.factory.abstractfactory.pizzastore.order;

import com.charwayh.factory.abstractfactory.pizzastore.pizza.LDCheesePizza;
import com.charwayh.factory.abstractfactory.pizzastore.pizza.LDGreekPizza;
import com.charwayh.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @author charwayH
 */
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式...");
        Pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new LDGreekPizza();
        }else if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else {
            pizza = null;
        }
        return pizza;
    }
}
