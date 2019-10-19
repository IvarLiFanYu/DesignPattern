package com.lfy.liskov;

public class Liskov {

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.test1(12,5));
    }

}

class A {
    public int test1(int a, int b){
        return a + b;
    }
}

//使用聚合
//不会担心因为重写而导致的错误发生
class B {
    private A  a = new A();
    public int test1(int a, int b){
        return this.a.test1(a,b);
    }
}

//使用继承耦合度较高
//切若无意将父类方法重写, 再次进行调用则会产生意想不到的错误
//因此不满足里氏替换原则
/*
class B extends A {
    //无意进行父类的重写
    public int test1(int a, int b){
        return a - b;
    }
}*/
