package com.lfy.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        AbstractAdapter abstractAdapter = new AbstractAdapter() {
            //只需要覆盖使用的接口方法
            @Override
            public void m1() {
                System.out.println("使用了m1的方法...");
            }
        };
        abstractAdapter.m1();
    }
}
