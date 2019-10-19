package com.lfy.strategy;

public class ToyDuck extends Duck {

    public ToyDuck() {
        super.setFlyBehevior(new NoFlyBehevior());
        super.setQuackBehevior(new NoQuackBehevior());
        super.setName("玩具鸭");
    }

}
