package com.lfy.chain;

public class SchoolMasterApprover extends Approver {

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchersRequest request) {
        if (request.getPrice() >= 30000) {
            System.out.println("请求编号为"+request.getNo()+"请求被"+this.name+"处理.");
        } else {
            this.approver.processRequest(request);
        }
    }

}
