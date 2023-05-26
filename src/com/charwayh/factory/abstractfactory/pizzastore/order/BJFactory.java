package com.charwayh.factory.abstractfactory.pizzastore.order;


import com.charwayh.factory.abstractfactory.pizzastore.pizza.BJCheesePizza;
import com.charwayh.factory.abstractfactory.pizzastore.pizza.Pizza;
import com.charwayh.factory.abstractfactory.pizzastore.pizza.BJGreekPizza;

/**
 * @author charwayH
 */
public class BJFactory implements AbsFactory {
    @Override
    public  Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式...");
        Pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new BJGreekPizza();
        }else if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else {
            pizza = null;
        }
        return pizza;
    }
}
