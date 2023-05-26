package com.charwayh.factory.factorymethod.pizzastore.pizza;

/**
 * @author charwayH
 * Pizza抽象类
 */
public abstract class Pizza {
    // 名字
    protected String name;
    // 准备不同的原材料
    public abstract void prepare();

    public void bake(){
        System.out.println("baking");
    }

    public void cut(){
        System.out.println("cutting");
    }

    public void box(){
        System.out.println("boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
