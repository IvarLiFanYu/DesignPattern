package com.lfy.strategy;

public class Client {
    public static void main(String[] args) {
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        BeiGingDuck beiGingDuck = new BeiGingDuck();
        beiGingDuck.display();
        FlyDuck flyDuck = new FlyDuck();
        flyDuck.display();
    }
}
