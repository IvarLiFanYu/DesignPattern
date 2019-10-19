package com.lfy.singleResponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RodeVehicle rodeVehicle = new RodeVehicle();
        rodeVehicle.run("火车");
        A airVehicle = new A();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}

// 该方式遵循了单一职责原则.
// 但是当类进行修改时, 客户端程序也需要修改
// 而且该类中的方法很简单, 因此可以在方法层面上进行单一职责原则
class RodeVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上行驶");
    }
}
class A {
    public void run(String vehicle){
        System.out.println(vehicle+"在天空上行驶");
    }
}
class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在水上行驶");
    }
}
