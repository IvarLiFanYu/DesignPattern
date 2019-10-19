package com.lfy.builder;

public class HighHouse extends House {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void buildRoofed() {
        System.out.println("高楼封顶");
    }
}
