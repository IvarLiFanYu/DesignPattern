package com.lfy.singleton;

/**
 * 饿汉式 静态变量测试
 */
public class SingletonTest1 {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }

}

/**
 * 饿汉式 静态变量
 */
class Singleton {

    private Singleton(){}

    //2. 本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3. 提供公共静态方法返回实例对象
    public static Singleton getInstance(){
        return instance;
    }

}
