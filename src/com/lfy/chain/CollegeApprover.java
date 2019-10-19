package com.lfy.chain;

public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchersRequest request) {
        if (request.getPrice() > 5000 && request.getPrice() <= 10000) {
            System.out.println("请求编号为"+request.getNo()+"请求被"+this.name+"处理.");
        } else {
            this.approver.processRequest(request);
        }
    }

}
