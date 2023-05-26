package com.charwayh.builder.improve;

/**
 * @author charwayH
 * 抽象的建造者
 */
public abstract class HouseBuilder {

    protected House house = new House();

    /**
     * 将建造的流程写好，抽象的方法
     */
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    /**
     * 建造好产品，将产品返回
     * @return 产品
     */
    public House buildHouse(){
        return house;
    }
}
