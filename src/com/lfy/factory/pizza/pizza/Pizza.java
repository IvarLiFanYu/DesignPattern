package com.lfy.factory.pizza.pizza;

/**
 * @Author 李凡宇
 */
public abstract class Pizza {

    public String pizzaName;

    /**
     * 准备原材料
     */
    public abstract void prepare();

    public void bake(){
        System.out.println(pizzaName+"进行烘焙....");
    }

    public void cut() {
        System.out.println(pizzaName+"进行切割...");
    }

    public void box(){
        System.out.println(pizzaName+"进行装盘...");
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }
}
