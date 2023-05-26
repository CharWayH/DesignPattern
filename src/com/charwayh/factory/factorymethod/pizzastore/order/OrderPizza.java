package com.charwayh.factory.factorymethod.pizzastore.order;


import com.charwayh.factory.factorymethod.pizzastore.pizza.Pizza;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author charwayH
 */
public abstract class OrderPizza {
    /**
     * 定义一个抽象方法，createPizza，让各个工厂子类自己实现
     * @param orderType 订购pizza的类型
     * @return 返回一个pizza实例
     */
    abstract Pizza createPizza(String orderType);

    /**
     * 构造器
     */
    public OrderPizza(){
        String orderType;
        Pizza pizza;
            do{
                orderType = gettype();
                // 抽象方法，由工厂子类完成
                pizza = createPizza(orderType);
                if (pizza != null) {
                    // pizza制作过程
                    pizza.prepare();
                    pizza.bake();
                    pizza.cut();
                    pizza.box();
                }else {
                    System.out.println("订购失败...");
                    break;
                }
            }while (true);
    }

    /**
     * 可以获取客户希望订购的披萨种类
     */
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
