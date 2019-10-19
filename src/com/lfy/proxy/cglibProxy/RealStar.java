package com.lfy.proxy.cglibProxy;

/**
 * 真实角色类 被代理对象
 */
public class RealStar {
    public String sayHello(String name) {
        System.out.println("hello"+name);
        return "hello,"+name;
    }
}
