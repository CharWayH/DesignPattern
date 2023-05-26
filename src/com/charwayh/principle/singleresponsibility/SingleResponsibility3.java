package com.charwayh.principle.singleresponsibility;

/**
 * 1.这种修改没有对原来对类进行很大的修改，只是增加方法
 * 2.这里虽然没有在类这个级别上遵循单一职责原则，但是在方法级别上仍然遵循了单一职责原则
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle3 vehicle3 = new Vehicle3();
        vehicle3.run("汽车");
        vehicle3.run("摩托车");
        vehicle3.runAir("飞机");
        vehicle3.runWater("轮船");
    }
}

class Vehicle3{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上跑...");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle + "在天上飞...");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle + "在水中上运行...");
    }
}
