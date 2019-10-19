package com.lfy.strategy;

public class NoQuackBehevior implements QuackBehevior {
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
