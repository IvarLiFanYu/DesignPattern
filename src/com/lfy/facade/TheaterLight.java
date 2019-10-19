package com.lfy.facade;

public class TheaterLight {
    private static TheaterLight theaterLight = new TheaterLight();
    public static TheaterLight getInstance() {
        return theaterLight;
    }
    public void on() {
        System.out.println("Theater on...");
    }
    public void off() {
        System.out.println("Theater off...");
    }
    public void lighter() {
        System.out.println("Theater lighter...");
    }
    public void dim() {
        System.out.println("Theater dim...");
    }
}
