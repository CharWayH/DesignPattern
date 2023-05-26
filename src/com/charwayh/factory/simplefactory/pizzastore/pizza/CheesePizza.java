package com.charwayh.factory.simplefactory.pizzastore.pizza;

/**
 * @author charwayH
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给奶酪披萨准备原材料");
    }
}
