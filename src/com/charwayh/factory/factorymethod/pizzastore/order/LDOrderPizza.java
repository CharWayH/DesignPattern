package com.charwayh.factory.factorymethod.pizzastore.order;

import com.charwayh.factory.factorymethod.pizzastore.pizza.*;

/**
 * @author charwayH
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
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
