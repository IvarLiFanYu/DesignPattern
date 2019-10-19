package com.lfy.strategy;

public class GaGaQuackBehevior implements QuackBehevior {
    @Override
    public void quack() {
        System.out.println("嘎嘎叫");
    }
}
