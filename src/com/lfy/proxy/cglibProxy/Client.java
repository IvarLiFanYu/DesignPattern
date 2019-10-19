package com.lfy.proxy.cglibProxy;

public class Client {
    public static void main(String[] args) {
        RealStar realStar = new RealStar();
        StarProxyFactory proxyFactory = new StarProxyFactory(realStar);
        RealStar starInstance = (RealStar) proxyFactory.getStarInstance();
        String lfy = starInstance.sayHello("lfy");
        System.out.println(lfy);
    }
}
