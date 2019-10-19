package com.lfy.singleton;

/**
 * 饿汉式 静态代码块测试
 */
public class SingletonTest2 {

    public static void main(String[] args) {
        Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println(singleton1 == singleton2);
    }

}

//饿汉式 静态代码块
class Singleton2 {

    //1. 私有构造方法
    private Singleton2(){}
    //2. 声明变量
    private static Singleton2 instance;
    //3. 编写静态代码块初始化变量
    static {
        instance = new Singleton2();
    }
    //4. 提供返回对象instance的方法
    public static Singleton2 getInstance(){
        return instance;
    }

}
