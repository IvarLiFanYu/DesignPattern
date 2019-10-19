package com.lfy.decorator;

public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDescription(" 咖啡 ");
        setPrice(3);
    }
}
