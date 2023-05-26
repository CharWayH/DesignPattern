package com.charwayh.factory.factorymethod.pizzastore.pizza;

/**
 * @author charwayH
 */
public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给伦敦奶酪披萨准备原材料");
    }
}
