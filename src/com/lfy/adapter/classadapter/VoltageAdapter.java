package com.lfy.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        int src = output220V();
        int dst = src / 44;
        return dst;
    }
}
