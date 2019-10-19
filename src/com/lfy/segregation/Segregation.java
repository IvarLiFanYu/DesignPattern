package com.lfy.segregation;

/**
 * 接口隔离原则
 * 客户端不应该依赖他不需要的接口, 即一个类对另一个类的依赖应该建立在最小的接口上
 */
public class Segregation {
    public static void main(String[] args) {
       /* A a = new A();
        a.operation1(new B());
        a.operation2(new B());
        a.operation3(new B());
        C c = new C();
        c.operation1(new D());
        c.operation4(new D());
        c.operation5(new D());*/
        A a = new A();
        a.operation1(new B());
        a.operation2(new B());
        a.operation3(new B());
        C c = new C();
        c.operation1(new D());
        c.operation4(new D());
        c.operation5(new D());
    }
}

interface Interface1 {
    void operation1();
}
interface Interface2 {
    void operation2();
    void operation3();
}
interface Interface3 {
    void operation4();
    void operation5();
}
class B implements  Interface1, Interface2 {
    @Override
    public void operation1() {
        System.out.println("B operation1");
    }
    @Override
    public void operation2() {
        System.out.println("B operation2");
    }
    @Override
    public void operation3() {
        System.out.println("B operation3");
    }
}

class D implements Interface1, Interface3 {

    @Override
    public void operation1() {
        System.out.println("D operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D operation1");
    }

    @Override
    public void operation5() {
        System.out.println("D operation1");
    }
}
class A {
    public void operation1(Interface1 interface1){
       interface1.operation1();
    }
    public void operation2(Interface2 interface2){
       interface2.operation2();
    }
    public void operation3(Interface2 interface2){
      interface2.operation3();
    }
}
class C {
    public void operation1(Interface1 interface1){
       interface1.operation1();
    }
    public void operation4(Interface3 interface3){
        interface3.operation4();
    }
    public void operation5(Interface3 interface3){
        interface3.operation5();
    }
}

/*
interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements  Interface1 {

    @Override
    public void operation1() {
        System.out.println("B operation1...");
    }

    @Override
    public void operation2() {
        System.out.println("B operation2...");
    }

    @Override
    public void operation3() {
        System.out.println("B operation3...");
    }

    @Override
    public void operation4() {
        System.out.println("B operation4...");
    }

    @Override
    public void operation5() {
        System.out.println("B operation5...");
    }
}

class D implements  Interface1 {

    @Override
    public void operation1() {
        System.out.println("D operation1...");
    }

    @Override
    public void operation2() {
        System.out.println("D operation2...");
    }

    @Override
    public void operation3() {
        System.out.println("D operation3...");
    }

    @Override
    public void operation4() {
        System.out.println("D operation4...");
    }

    @Override
    public void operation5() {
        System.out.println("D operation5...");
    }
}

// 1 2 3
class A {
    public void operation1(B b){
        b.operation1();
    }
    public void operation2(B b){
        b.operation2();
    }
    public void operation3(B b){
        b.operation3();
    }
}

// 1 4 5
class C {
    public void operation1(D d){
        d.operation1();
    }
    public void operation4(D d){
        d.operation4();
    }
    public void operation5(D d){
        d.operation5();
    }
}*/
