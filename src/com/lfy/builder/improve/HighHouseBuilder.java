package com.lfy.builder.improve;

public class HighHouseBuilder extends HouseBuilder {

    @Override
    public void buildBase() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void buildRoofed() {
        System.out.println("高楼盖房顶");
    }
}
