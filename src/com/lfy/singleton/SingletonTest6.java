package com.lfy.singleton;

/**
 * 双重检测锁
 */
public class SingletonTest6 {

    public static void main(String[] args) {
        Singleton6 singleton1 = Singleton6.getInstance();
        Singleton6 singleton2 = Singleton6.getInstance();
        System.out.println(singleton1 == singleton2);
    }

}

class Singleton6 {
    //1. 私有构造器
    private Singleton6(){}
    //2. 创建对象实例 内存修改即可刷新到线程内存中
    private static volatile Singleton6 instance;
    //3. 编写返回实例对象的方法
    public static Singleton6 getInstance(){
        //第一层判断提高效率
        if(instance != null){
            synchronized (Singleton6.class){
                //第二层判断保证线程安全
                if(instance != null){
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
