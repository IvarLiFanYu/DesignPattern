package com.lfy.builder.improve;

public class Client {

    public static void main(String[] args) {

        HouseBuilder builder = new CommonHouseBuilder();
        HouseDirector director = new HouseDirector(builder);
        director.constructHouse();

        HouseBuilder builder1 = new HighHouseBuilder();
        HouseDirector director1 = new HouseDirector(builder1);
        director1.constructHouse();

    }

}
