package com.lfy.strategy;

public class FlyDuck extends Duck {
    public FlyDuck() {
        super.flyBehevior = new GoodFlyBehevior();
        super.quackBehevior = new GaGaQuackBehevior();
        super.name = "会飞的鸭子";
    }
}
