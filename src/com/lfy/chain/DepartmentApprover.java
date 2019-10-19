package com.lfy.chain;

public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchersRequest request) {
        if (request.getPrice() <= 5000) {
            System.out.println("请求编号为"+request.getNo()+"请求被"+this.name+"处理.");
        } else {
            this.approver.processRequest(request);
        }
    }

}
