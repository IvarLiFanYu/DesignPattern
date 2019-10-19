package com.lfy.singleton;

/**
 * 懒汉式  同步代码块 线程不安全
 */
public class SingletonTest5 {

    public static void main(String[] args) {
        Singleton4 singleton1 = Singleton4.getInstance();
        Singleton4 singleton2 = Singleton4.getInstance();
        System.out.println(singleton1 == singleton2);
    }

}

class Singleton5 {

    //1. 私有构造方法
    private Singleton5(){}
    //2. 声明变量
    private static Singleton5 instance;

    //3. 提供返回对象instance的方法
    public static Singleton5 getInstance(){
        if(instance != null){
            //并无意义, 因为线程不安全
            synchronized(Singleton5.class) {
                instance = new Singleton5();
            }
        }
        return instance;
    }

}
