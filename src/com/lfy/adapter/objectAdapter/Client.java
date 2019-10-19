package com.lfy.adapter.objectAdapter;

public class Client {
    public static void main(String[] args) {
        new Phone().charging(new VoltageAdapter(new Voltage220V()));
    }
}
