package com.lfy.singleResponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        RodeVehicle2 rodeVehicle2 = new RodeVehicle2();
        rodeVehicle2.rodeRun("汽车");
        rodeVehicle2.airRun("飞机");
        rodeVehicle2.waterRun("轮船");
    }
}

// 该方式没有完全遵循单一职责原则.
// 只是在方法层面上进行单一职责原则.
class RodeVehicle2{
    public void rodeRun(String vehicle){
        System.out.println(vehicle+"在公路上行驶");
    }
    public void waterRun(String vehicle){
        System.out.println(vehicle+"在水上行驶");
    }
    public void airRun(String vehicle){
        System.out.println(vehicle+"在飞机上行驶");
    }
}
