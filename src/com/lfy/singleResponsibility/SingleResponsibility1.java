package com.lfy.singleResponsibility;

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("火车");
        vehicle.run("飞机");
        vehicle.run("汽车");
    }
}

// 这种方式显然是不合理的, 因为违反了单一职责原则
// 因为该类不仅负责汽车, 还有飞机和火车 因此需要进行拆分
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上行驶");
    }
}
