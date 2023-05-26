package com.charwayh.builder;

/**
 * @author charwayH
 */
public class HighBuilding extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println(" 给高楼打地基 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 给高楼砌墙 ");
    }

    @Override
    public void roofed() {
        System.out.println(" 给高楼封顶 ");
    }
}
