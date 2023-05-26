package com.charwayh.builder.improve;

/**
 * @author charwayH
 */
public class Client {
    public static void main(String[] args) {
        // 盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        // 准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        // 完成盖房子，返回产品(房子)
        houseDirector.constructHouse();
        System.out.println("-------------------------------------------");


        // 盖高楼
        HighBuildingHouse highBuildingHouse = new HighBuildingHouse();
        // 准备创建房子的指挥者
        HouseDirector houseDirector2 = new HouseDirector(highBuildingHouse);
        // 完成盖房子，返回产品(房子)
        houseDirector2.constructHouse();
    }
}
