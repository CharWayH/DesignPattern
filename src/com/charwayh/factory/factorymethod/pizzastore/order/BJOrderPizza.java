package com.charwayh.factory.factorymethod.pizzastore.order;

import com.charwayh.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.charwayh.factory.factorymethod.pizzastore.pizza.BJGreekPizza;
import com.charwayh.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author charwayH
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
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
