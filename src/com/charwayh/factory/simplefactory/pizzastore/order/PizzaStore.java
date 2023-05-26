package com.charwayh.factory.simplefactory.pizzastore.order;

import com.charwayh.factory.simplefactory.pizzastore.pizza.SimpleFactory;

/**
 * @author charwayH
 * 相当于是一个客户端，发出订购
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
        System.out.println("运行结束");

//        new OrderPizza2();
//        System.out.println("运行结束");
    }
}
