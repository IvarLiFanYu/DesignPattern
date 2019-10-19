package com.lfy.state;

public class DispenceOutState extends State {

    RaffleActivity raffleActivity;

    public DispenceOutState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void reduceMoney() {
        System.out.println("很遗憾,奖品发放完了!");
    }

    @Override
    public boolean raffle() {
        System.out.println("很遗憾,奖品发放完了!");
        return false;
    }

    @Override
    public void dispencePrize() {
        System.out.println("很遗憾,奖品发放完了!");
    }
}
