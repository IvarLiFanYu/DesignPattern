package com.lfy.state;

public class Client {
    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(1);
        for (int i = 0; i < 20; i++) {
            System.out.println("*****"+i+"号顾客抽奖开始*****");
            activity.debuctMoney();
            activity.raffle();
            System.out.println("\n");
        }
    }
}
