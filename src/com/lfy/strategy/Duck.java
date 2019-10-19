package com.lfy.strategy;

public abstract class Duck {

    FlyBehevior flyBehevior;
    QuackBehevior quackBehevior;
    String name;

    public void setFlyBehevior(FlyBehevior flyBehevior) {
        this.flyBehevior = flyBehevior;
    }
    public void setQuackBehevior(QuackBehevior quackBehevior) {
        this.quackBehevior = quackBehevior;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name);
        flyBehevior.fly();
        quackBehevior.quack();
    }

}
