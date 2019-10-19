package com.lfy.strategy;

public class GuGuQuackBehevior implements QuackBehevior {
    @Override
    public void quack() {
        System.out.println("咕咕叫");
    }
}
