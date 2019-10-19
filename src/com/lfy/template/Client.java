package com.lfy.template;

public class Client {
    public static void main(String[] args) {
        PennutSoyaMilk milk = new PennutSoyaMilk();
        milk.make();
        BlackBeanSoyaMilk blackBeanSoyaMilk = new BlackBeanSoyaMilk();
        blackBeanSoyaMilk.make();
        PureSoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
