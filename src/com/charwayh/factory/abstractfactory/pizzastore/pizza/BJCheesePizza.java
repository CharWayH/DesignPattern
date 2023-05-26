package com.charwayh.factory.abstractfactory.pizzastore.pizza;

/**
 * @author charwayH
 */
public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给北京奶酪披萨准备原材料");
    }
}
