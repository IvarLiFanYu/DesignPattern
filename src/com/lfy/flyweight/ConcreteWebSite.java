package com.lfy.flyweight;

public class ConcreteWebSite extends WebSite {

    //网站的发布形式
    //内部状态
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    //User 为外部状态
    @Override
    public void use(User user) {
        System.out.println("ConcreteWebSite <"+type+" "+user.getName()+"> use ...");
    }
}
