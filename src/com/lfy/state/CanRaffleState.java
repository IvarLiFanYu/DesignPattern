package com.lfy.state;

import java.util.Random;

public class CanRaffleState extends State {

    RaffleActivity raffleActivity;

    public CanRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void reduceMoney() {
        System.out.println("您已经扣除积分了哦!");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖,请稍后...");
        Random r = new Random();
        int i = r.nextInt(10);
        if (i == 0) {
            raffleActivity.setState(raffleActivity.getDispenceState());
            return true;
        } else {
            System.out.println("很遗憾,没有抽中奖品!");
            raffleActivity.setState(raffleActivity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispencePrize() {
        System.out.println("不能发放奖品!");
    }
}
