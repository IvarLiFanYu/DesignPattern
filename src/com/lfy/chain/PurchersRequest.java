package com.lfy.chain;

public class PurchersRequest {

    private int no;
    private double price;

    public PurchersRequest(int no, double price) {
        this.no = no;
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
