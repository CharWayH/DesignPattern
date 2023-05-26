package com.charwayh.factory.abstractfactory.pizzastore.pizza;

/**
 * @author charwayH
 */
public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给伦敦希腊披萨准备原材料");
    }
}
