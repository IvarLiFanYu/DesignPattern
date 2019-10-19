package com.lfy.adapter.objectAdapter;

public class VoltageAdapter implements Voltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter (Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int src = voltage220V.output220V();
        int dst = src / 44;
        return dst;
    }
}
