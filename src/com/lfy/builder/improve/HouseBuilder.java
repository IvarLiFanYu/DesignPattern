package com.lfy.builder.improve;

public abstract class HouseBuilder {

    protected House house = new House();

    public abstract void buildBase();
    public abstract void buildWall();
    public abstract void buildRoofed();

    public House build() {
        return house;
    }

}
