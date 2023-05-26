package com.charwayh.factory.abstractfactory.pizzastore.order;

import com.charwayh.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @author charwayH
 * 一个抽象工厂的模式的抽象层(接口)
 */
public interface AbsFactory {

    Pizza createPizza(String orderType);
}
