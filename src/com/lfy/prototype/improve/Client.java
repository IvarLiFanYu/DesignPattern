package com.lfy.prototype.improve;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep friend = new Sheep("Jerry",1,"黑色");
        Sheep sheep = new Sheep("tom",1,"白色");
        sheep.setFriend(friend);
        Sheep sheep1 = (Sheep)sheep.clone();
        Sheep sheep2 = (Sheep)sheep.clone();
        System.out.println(friend.hashCode());
        System.out.println(sheep1.getFriend().hashCode());
        System.out.println(sheep2.getFriend().hashCode());
    }
}
