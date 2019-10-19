package com.lfy.template;

public abstract class SoyaMilk {
    public void make()  {
        select();
        if(isAdd()) {
            add();
        }
        soak();
        beat();
    }
    public void select() {
        System.out.println("选新鲜的食材");
    }
    public abstract void add();
    public boolean isAdd() {
        return true;
    }
    public void soak() {
        System.out.println("打碎豆子");
    }
    public void beat() {
        System.out.println("进行加热");
    }
}
