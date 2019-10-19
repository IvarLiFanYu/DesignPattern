package com.lfy.decorator;

public class Coffee extends Drink {

    @Override
    public double cost() {
        return super.getPrice();
    }

}
