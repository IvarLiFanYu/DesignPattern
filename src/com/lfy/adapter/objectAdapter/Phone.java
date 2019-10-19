package com.lfy.adapter.objectAdapter;

public class Phone {

    public void charging (VoltageAdapter adapter) {
        if(adapter.output5V() == 5) {
            System.out.println("输出5V电压...");
        } else if (adapter.output5V() > 5) {
            System.out.println("电压过大, 不能充电...");
        }
    }

}
