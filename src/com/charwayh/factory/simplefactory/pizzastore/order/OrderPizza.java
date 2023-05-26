package com.charwayh.factory.simplefactory.pizzastore.order;


import com.charwayh.factory.simplefactory.pizzastore.pizza.Pizza;
import com.charwayh.factory.simplefactory.pizzastore.pizza.SimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author charwayH
 */
public class OrderPizza {

    SimpleFactory simpleFactory;
    // 订购披萨的类型
    String orderType = null;
    Pizza pizza = null;
    public void setSimpleFactory(SimpleFactory simpleFactory) {
        orderType = "";
        this.simpleFactory = simpleFactory;

        do{
            orderType = gettype();
            pizza = this.simpleFactory.createCreate(orderType);
            if(pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败,没有此类披萨");
                break;
            }
        }while (true);
    }

    // 构造器
    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }
    //写一个方法，可以获取客户希望订购的披萨种类
    private String gettype(){

        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
