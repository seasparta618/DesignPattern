package patterns.ResponsibilityChainPattern;

import org.junit.Test;

public class Client {

    @Test
    public void test() {
        GeneralManager generalManager = new GeneralManager();
        TeamLeader teamLeader = new TeamLeader();
        DepartmentManager departmentManager = new DepartmentManager();
        teamLeader.setNextApproveLeave(departmentManager);
        departmentManager.setNextApproveLeave(generalManager);
        LeaveRequest leaveRequest1 = new LeaveRequest.Builder().requestPersonName("Leon").numberOfDayOff(7).reason("Got Sick").build();
        teamLeader.approve(leaveRequest1);
        LeaveRequest leaveRequest2 = new LeaveRequest.Builder().requestPersonName("Jane").numberOfDayOff(1).reason("Property Inspection").build();
        LeaveRequest leaveRequest3 = new LeaveRequest.Builder().requestPersonName("James").numberOfDayOff(100).reason("Go back to Ukraine for war").build();
        teamLeader.approve(leaveRequest2);
        teamLeader.approve(leaveRequest3);
    }
}
