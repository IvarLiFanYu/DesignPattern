package com.lfy.factory.pizza.pizza;

/**
 * @Author 李凡宇
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(pizzaName+"进行原材料的准备");
    }

}
