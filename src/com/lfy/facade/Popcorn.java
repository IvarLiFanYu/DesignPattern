package com.lfy.facade;

public class Popcorn {

    private static Popcorn popcorn = new Popcorn();

    public static Popcorn getInstance() {
        return popcorn;
    }

    public void on() {
        System.out.println("PopCorn on...");
    }

    public void off() {
        System.out.println("PopCorn off...");
    }

    public void pop() {
        System.out.println("PopCorn poping...");
    }

}
