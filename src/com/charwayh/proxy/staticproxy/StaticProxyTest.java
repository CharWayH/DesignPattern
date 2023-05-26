package com.charwayh.proxy.staticproxy;/**
 * @author: create by CharwayH
 * @description: com.charwayh.proxy.staticproxy
 * @date:2023/5/26
 */public class StaticProxyTest {
    public static void main(String[] args) {
        System.out.println("=====自己租房子=====");
        RentHouseImpl rentHouse = new RentHouseImpl();
        // 自己租房子
        rentHouse.rentHouse();
        // 使用静态代理，找中介租房子
        System.out.println("=====使用静态代理，找中介租房子=====");
        RentHouseProxy rentHouseProxy = new RentHouseProxy(rentHouse);
        rentHouseProxy.rentHouse();
    }
}
