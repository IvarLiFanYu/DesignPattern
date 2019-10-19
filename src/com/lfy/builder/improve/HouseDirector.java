package com.lfy.builder.improve;

public class HouseDirector {

    HouseBuilder houseBuilder = null;

    public HouseDirector (HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.buildBase();
        houseBuilder.buildWall();
        houseBuilder.buildRoofed();
        return houseBuilder.build();
    }
}
