package com.charwayh.factory.abstractfactory.pizzastore.order;


import com.charwayh.factory.abstractfactory.pizzastore.pizza.Pizza;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author charwayH
 */
public class OrderPizza {

    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setAbsFactory(absFactory);
    }

    public void setAbsFactory(AbsFactory absFactory) {
        Pizza pizza = null;
        // 用户输入
        String orderType = "";
        this.absFactory = absFactory;
        do{
            orderType = gettype();
            pizza = absFactory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");
                break;
            }
        }while (true);

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
