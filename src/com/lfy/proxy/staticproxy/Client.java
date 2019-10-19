package com.lfy.proxy.staticproxy;

//因为客户直接与代理谈业务
//因此真实角色与代理角色都应该实现相同的接口
public class Client {
    public static void main(String[] args) {
        RealStar star = new RealStar();
        Star proxyStar = (Star) new ProxyStar(star).getStarProxy();
        proxyStar.bookTicket();
        proxyStar.sign();
        proxyStar.sing();
        proxyStar.collectMoney();
        //class com.sun.proxy.$Proxy0
        System.out.println(proxyStar.getClass());
    }
}
