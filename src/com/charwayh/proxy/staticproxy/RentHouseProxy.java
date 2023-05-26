package com.charwayh.proxy.staticproxy;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.proxy.staticproxy
 * @date:2023/5/26
 */
public class RentHouseProxy implements IRentHouse{
    private IRentHouse iRentHouse;
    public RentHouseProxy(IRentHouse iRentHouse) {
        this.iRentHouse = iRentHouse;
    }
    @Override
    public void rentHouse() {
        System.out.println("找中介，让中介帮忙租房子...");
        iRentHouse.rentHouse();
        System.out.println("租到了房子...");
    }
}
