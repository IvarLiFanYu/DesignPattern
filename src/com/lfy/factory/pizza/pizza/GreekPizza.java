package com.lfy.factory.pizza.pizza;

/**
 * @Author 李凡宇
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(pizzaName+"准备原材料...");
    }

}
