package com.lfy.builder.improve;

public class CommonHouseBuilder extends HouseBuilder {

    @Override
    public void buildBase() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void buildRoofed() {
        System.out.println("普通房子盖房顶");
    }
}
