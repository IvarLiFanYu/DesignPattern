package com.lfy.builder;

public abstract class House {
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void buildRoofed();
    public void createHouse() {
        buildBasic();
        buildWall();
        buildRoofed();
    }
}
