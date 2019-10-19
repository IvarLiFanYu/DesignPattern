package com.lfy.strategy;

public class BeiGingDuck extends Duck {
    BeiGingDuck () {
        super.flyBehevior = new BadFlyBehevior();
        super.quackBehevior = new GuGuQuackBehevior();
        super.name = "北京鸭";
    }
}
