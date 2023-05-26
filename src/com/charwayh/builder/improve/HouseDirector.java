package com.charwayh.builder.improve;

/**
 * @author charwayH
 * 指挥者，这里会指定制作流程，返回产品
 */
public class HouseDirector {
    HouseBuilder houseBuilder;

    /**
     * 通过构造器传入houseBuilder
     * @param houseBuilder
     */
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 通过setter 传入houseBuilder
     */
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }


    /**
     * 如何建造房子的流程交给指挥者
     * @return
     */
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
