package com.lfy.facade;

public class TheaterFacade {

    private DvdPlayer dvdPlayer = DvdPlayer.getInstance();
    private Popcorn popcorn = Popcorn.getInstance();
    private Projector projector = Projector.getInstance();
    private Screen screen = Screen.getInstance();
    private TheaterLight theaterLight = TheaterLight.getInstance();

    public void start() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        dvdPlayer.on();
        theaterLight.dim();
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        popcorn.off();
        screen.on();
        projector.off();
        dvdPlayer.off();
        theaterLight.lighter();
        dvdPlayer.off();
    }

}
