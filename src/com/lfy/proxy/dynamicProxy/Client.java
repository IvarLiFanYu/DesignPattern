package com.lfy.proxy.dynamicProxy;

import static java.lang.reflect.Proxy.newProxyInstance;

public class Client {
    public static void main(String[] args) {
        StarHandler handler = new StarHandler(new RealStar());
        Star proxy = (Star) newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class},handler);
        proxy.bookTicket();
        proxy.sign();
        proxy.sing();
        proxy.collectMoney();
    }
}
