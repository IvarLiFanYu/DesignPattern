package com.lfy.strategy;

public class BadFlyBehevior implements FlyBehevior
{
    @Override
    public void fly() {
        System.out.println("飞的不好");
    }
}
