package com.lfy.proxy.staticproxy;

/**
 * 真实角色类
 */
public class RealStar implements Star {
    @Override
    public void bookTicket() {
        System.out.println("RealStar.bookTicket");
    }

    @Override
    public void sign() {
        System.out.println("RealStar.sign");
    }

    @Override
    public void sing() {
        System.out.println("RealStar.sing");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney");
    }
}
