package com.lfy.strategy;

public class GoodFlyBehevior implements FlyBehevior {
    @Override
    public void fly() {
        System.out.println("飞行优秀");
    }
}
