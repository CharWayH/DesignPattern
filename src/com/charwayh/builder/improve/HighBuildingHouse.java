package com.charwayh.builder.improve;

/**
 * @author charwayH
 */
public class HighBuildingHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println(" 高楼打地基50米 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 高楼砌墙20cm ");
    }

    @Override
    public void roofed() {
        System.out.println(" 高楼封顶 ");
    }
}
