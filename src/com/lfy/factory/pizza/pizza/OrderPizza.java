package com.lfy.factory.pizza.pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author 李凡宇
 */
public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        //订单类型
        do {
            String orderType;
            orderType = getOrderType();
            if ("cheese".equals(orderType)){
                pizza = new CheesePizza();
                pizza.setPizzaName("cheese");
            }else if("greek".equals(orderType)) {
                pizza = new GreekPizza();
                pizza.setPizzaName("greek");
            } else {
              break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getOrderType() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input the Pizza Type:");
        String pizzaType = null;
        try {
            pizzaType = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pizzaType;
    }

}
