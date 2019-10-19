package com.lfy.chain;

public class Client {
    public static void main(String[] args) {

        PurchersRequest request = new PurchersRequest(1,2000);

        DepartmentApprover departmentApprover = new DepartmentApprover("部门主任");
        CollegeApprover collegeApprover = new CollegeApprover("系主任");
        VaceSchoolMasterApprover vaceSchoolMasterApprover = new VaceSchoolMasterApprover("副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");

        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(vaceSchoolMasterApprover);
        vaceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(request);

    }
}
