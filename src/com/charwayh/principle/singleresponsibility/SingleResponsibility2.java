package com.charwayh.principle.singleresponsibility;

/**
 * 方案2:
 * 1.遵循单一职责
 * 2.但这样做的改动比较大，即使将类分解了，同时要修改客户端
 * 3.改进:直接修改Vehicle类，改动的代码会比较少→方案3
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        roadVehicle.run("摩托车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上跑...");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在空中上飞...");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在水里上运行...");
    }
}
