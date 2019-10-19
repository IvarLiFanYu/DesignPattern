package com.lfy.strategy;

public class NoFlyBehevior implements FlyBehevior {
    @Override
    public void fly() {
        System.out.println("不会飞行");
    }
}
