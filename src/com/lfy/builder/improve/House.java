package com.lfy.builder.improve;

//相当于 Product
public class House {

    private String name;
    private Integer roofSize;

    public House() {
    }

    public House(String name, Integer roofSize) {
        this.name = name;
        this.roofSize = roofSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoofSize() {
        return roofSize;
    }

    public void setRoofSize(Integer roofSize) {
        this.roofSize = roofSize;
    }

}
