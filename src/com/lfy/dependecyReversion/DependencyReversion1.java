package com.lfy.dependecyReversion;

public class DependencyReversion1 {
    public static void main(String[] args) {
        //接口传递测试
        /*Driver driver = new Driver();
        driver.driveCar(new Motor());
        driver.driveCar(new Bus());*/
        //构造函数传递测试
        /*Driver driver = new Driver(new Motor());
        driver.driveCar();*/
        //setter方法传递测试
        Driver driver = new Driver();
        driver.setICar(new Bus());
        driver.driveCar();
    }
}

class Driver {
    //接口传递
    /*public void driveCar(ICar iCar){
        System.out.println(iCar.drive());
    }*/
    //构造传递
    /*ICar iCar;
    public Driver(ICar iCar){
        this.iCar = iCar;
    }
    public void driveCar(){
        System.out.println(iCar.drive());
    }*/
    //setter方法传递
    ICar iCar;
    public void setICar(ICar icar){
        this.iCar = icar;
    }
    public void driveCar(){
        System.out.println(iCar.drive());
    }
}

interface ICar {
    public String drive();
}

class Bus implements ICar {

    @Override
    public String drive() {
       return "Bus Drive";
    }
}

class Motor implements  ICar {

    @Override
    public String drive() {
        return "Motor Drive";
    }
}