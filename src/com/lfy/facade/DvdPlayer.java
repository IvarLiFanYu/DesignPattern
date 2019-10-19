package com.lfy.facade;

//DVD播放器
public class DvdPlayer {

    private static DvdPlayer dvdPlayer = new DvdPlayer();

    public static DvdPlayer getInstance() {
        return dvdPlayer;
    }

    public void on() {
        System.out.println("DvdPlayer on...");
    }

    public void off() {
        System.out.println("DvdPlayer off...");
    }

    public void play() {
        System.out.println("DvdPlayer play...");
    }

    public void pause() {
        System.out.println("DvdPlayer pause...");
    }

}
