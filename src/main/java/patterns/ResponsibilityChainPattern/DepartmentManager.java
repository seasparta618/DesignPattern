package patterns.ResponsibilityChainPattern;

public class DepartmentManager extends ApproveLeaveHandler {
    @Override
    protected void handle(LeaveRequest leaveRequest) {
        System.out.println(this.getLevel() + " received leave request from "+leaveRequest.getRequestPersonName() + "  for " + leaveRequest.getNumberOfDayOff() + " days with reason " + leaveRequest.getReason());
        System.out.println("Department manager is trying to approve");
    }

    public DepartmentManager() {
        super(ApproveLeaveHandler.NUM_ONE, ApproveLeaveHandler.NUM_THREE, "Department manager");
    }
}
