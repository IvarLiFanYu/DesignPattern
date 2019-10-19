package com.lfy.state;

public class DispenceState extends State {

    RaffleActivity raffleActivity;

    public DispenceState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void reduceMoney() {
        System.out.println("您已经扣除过积分了!");
    }

    @Override
    public boolean raffle() {
        System.out.println("您已经抽过奖了!");
        return false;
    }

    @Override
    public void dispencePrize() {
        if (raffleActivity.getCount() > 0) {
            System.out.println("恭喜,中奖了!");
            raffleActivity.setState(raffleActivity.getNoRaffleState());
        } else {
            System.out.println("很遗憾,奖品发放完了");
            raffleActivity.setState(raffleActivity.getDispenceOutState());
        }
    }
}
