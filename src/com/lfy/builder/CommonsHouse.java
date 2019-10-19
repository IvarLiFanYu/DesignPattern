package com.lfy.builder;

public class CommonsHouse extends House {

    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void buildRoofed() {
        System.out.println("普通房子封顶");
    }
}
