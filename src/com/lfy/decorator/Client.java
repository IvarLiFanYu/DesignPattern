package com.lfy.decorator;

public class Client {
    public static void main(String[] args) {
        //两份咖啡加牛奶的 LongBlack
        // LongBlack
        Drink order = new LongBlack();
        System.out.println("LongBlack:"+" 花费:"+order.cost());
        //加牛奶
        order = new Milk(order);
        System.out.println("LongBlack + milk:"+" 花费:"+order.cost());
        //加咖啡(第一份)
        order = new Chocolate(order);
        System.out.println("LongBlack + milk + chocolate:"+" 花费:"+order.cost());
        //加咖啡(第二份)
        order = new Chocolate(order);
        System.out.println("LongBlack + milk + chocolate + chocolate:"+" 花费:"+order.cost());
    }
}
