package com.lfy.bridge;

public abstract class AbstractPhone {

    protected ShellInterface shellInterface;

    public AbstractPhone (ShellInterface shellInterface) {
        this.shellInterface = shellInterface;
    }

    public AbstractPhone () {}

    public void call() {
        System.out.println("打电话");
    }

    public abstract void playMusic();

}
