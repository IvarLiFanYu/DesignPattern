package com.lfy.facade;

public class Screen {
    private static Screen screen = new Screen();
    public static Screen getInstance() {
        return screen;
    }
    public void on() {
        System.out.println("Screen on...");
    }
    public void off() {
        System.out.println("Screen off...");
    }
    public void up() {
        System.out.println("Screen up...");
    }
    public void down() {
        System.out.println("Screen down...");
    }
}
