package com.charwayh.factory.factorymethod.pizzastore.pizza;

/**
 * @author charwayH
 */
public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给北京希腊披萨准备原材料");
    }
}
