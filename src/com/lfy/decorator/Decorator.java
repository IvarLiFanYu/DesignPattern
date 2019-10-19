package com.lfy.decorator;

public class Decorator extends Drink {

    private Drink drink;

    public Decorator (Drink drink) {
        this.drink = drink;
    }

    @Override
    public double cost() {
        return this.getPrice() + drink.cost();
    }
}
