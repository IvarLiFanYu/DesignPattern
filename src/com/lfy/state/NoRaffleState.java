package com.lfy.state;

public class NoRaffleState extends State {

    /**
     * 抽奖活动
     */
    RaffleActivity raffleActivity;

    /**
     * 构造器传入活动,用来改变活动的状态
     * @param raffleActivity
     */
    public NoRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void reduceMoney() {
        System.out.println("扣除50积分,可以抽奖了!");
        raffleActivity.setState(raffleActivity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("必须先扣除积分才能抽奖哦!");
        return false;
    }

    @Override
    public void dispencePrize() {
        System.out.println("您还没有抽奖哦!");
    }

}
