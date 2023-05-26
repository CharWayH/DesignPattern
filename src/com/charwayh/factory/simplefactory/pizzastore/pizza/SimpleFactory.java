package com.charwayh.factory.simplefactory.pizzastore.pizza;

/**
 * @author charwayH
 */
public class SimpleFactory {
    public Pizza createCreate(String orderType){
        Pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }

    // 简单工厂模式也加静态工厂模式
    public static Pizza createCreate2(String orderType){
        Pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }
}
