package com.lfy.dependecyReversion;

public class DependencyReversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.say(new WeChat());
    }
}

class Person {
    public void say(IReceiver iReceiver){
        System.out.println(iReceiver.receiver());
    }
}
//利用依赖倒转原则, 面向切面编程
//相较于上一个方式, 该方式只需要添加一个新的类, 而无需修改客户端的代码, 而且提高了可扩展性.
interface IReceiver {
    public String receiver();
}

class WeChat implements IReceiver {
    @Override
    public String receiver() {
        return "WeChat";
    }
}

class QQ implements IReceiver {
    @Override
    public String receiver() {
        return "QQ";
    }
}

//该方式当更换为信息或者QQ时,既需要添加信息或者QQ的类,又要修改调用方添加方法.
/*
class Person {
    public void say(WeChat wechat){
        System.out.println(wechat.receive());
    }
}

class WeChat {
    public String receive() {
       return "WeChat";
    }
}*/
