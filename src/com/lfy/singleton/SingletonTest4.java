package com.lfy.singleton;

/**
 * 懒汉式 线程安全
 */
public class SingletonTest4 {

    public static void main(String[] args) {
        Singleton4 singleton1 = Singleton4.getInstance();
        Singleton4 singleton2 = Singleton4.getInstance();
        System.out.println(singleton1 == singleton2);
    }

}

class Singleton4 {

    //1. 私有构造方法
    private Singleton4(){}
    //2. 声明变量
    private static Singleton4 instance;

    //3. 提供返回对象instance的方法
    public static synchronized Singleton4 getInstance(){
        if(instance != null){
            instance = new Singleton4();
        }
        return instance;
    }

}
