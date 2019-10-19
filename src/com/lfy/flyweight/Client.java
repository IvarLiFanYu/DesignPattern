package com.lfy.flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        webSiteFactory.getWebSite("新闻").use(new User("tom"));
        webSiteFactory.getWebSite("博客").use(new User("jack"));
        webSiteFactory.getWebSite("新闻").use(new User("jerry"));
        webSiteFactory.getWebSite("博客").use(new User("smith"));
        System.out.println(webSiteFactory.getWebSiteCount());
    }
}
