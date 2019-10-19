package com.lfy.facade;

public class Projector {
    private static Projector projector = new Projector();
    public static Projector getInstance(){
        return projector;
    }
    public void on() {
        System.out.println("Projector on...");
    }
    public void off() {
        System.out.println("Projector off...");
    }
}
