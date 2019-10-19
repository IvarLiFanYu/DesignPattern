package com.lfy.singleton;

/**
 * 枚举单例
 */
public class SingletonTest8 {
    public static void main(String[] args) {
        Singleton8 instance1 = Singleton8.INSTANCE;
        Singleton8 instance2 = Singleton8.INSTANCE;
        System.out.println(instance1 == instance2);
    }
}
//使用枚举进行单例 推荐使用
enum Singleton8 {
    INSTANCE;
}
