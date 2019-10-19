package com.lfy.singleton;

/**
 * 静态内部类
 */
public class SingletonTest7 {

    public static void main(String[] args) {
        Singleton7 singleton1 = Singleton7.getInstance();
        Singleton7 singleton2 = Singleton7.getInstance();
        System.out.println(singleton1 == singleton2);
    }

}

//使用静态内部类保证懒加载, 因为只有使用的时候才会进行装载,且进行装载的过程中是线程安全的.
class Singleton7 {
    //1. 私有构造器
    private Singleton7(){}
    //2. 编写静态内部类
    private static class SingletonInstance {
       private static final Singleton7 INSTANCE = new Singleton7();
    }
    //3. 编写返回实例的方法
    public static Singleton7 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
