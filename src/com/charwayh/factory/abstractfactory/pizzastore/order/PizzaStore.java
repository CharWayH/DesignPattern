package com.charwayh.factory.abstractfactory.pizzastore.order;


/**
 * @author charwayH
 * 相当于是一个客户端，发出订购
 */
public class PizzaStore {
    public static void main(String[] args) {
        //new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }
}
