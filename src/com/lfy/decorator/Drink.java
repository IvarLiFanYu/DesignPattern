package com.lfy.decorator;

public abstract class Drink {

    private String description;
    private double price;

    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //子类实现
    public abstract double cost();

}
