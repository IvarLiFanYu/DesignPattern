package com.lfy.singleton;

/**
 * 懒汉式 线程不安全
 */
public class SingletonTest3 {

    public static void main(String[] args) {
        Singleton3 singleton1 = Singleton3.getInstance();
        Singleton3 singleton2 = Singleton3.getInstance();
        System.out.println(singleton1 == singleton2);
    }

}

//饿汉式 静态代码块
class Singleton3 {

    //1. 私有构造方法
    private Singleton3(){}
    //2. 声明变量
    private static Singleton3 instance;

    //3. 提供返回对象instance的方法
    public static Singleton3 getInstance(){
        if(instance != null){
            instance = new Singleton3();
        }
        return instance;
    }

}
