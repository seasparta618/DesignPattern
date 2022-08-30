package patterns.ResponsibilityChainPattern;

public class TeamLeader extends ApproveLeaveHandler {
    @Override
    protected void handle(LeaveRequest leaveRequest) {
        System.out.println(this.getLevel() + " received leave request from "+leaveRequest.getRequestPersonName() + "  for " + leaveRequest.getNumberOfDayOff() + " days with reason " + leaveRequest.getReason());
        System.out.println("Team leader is trying to approve");
    }

    public TeamLeader() {
        super(0, ApproveLeaveHandler.NUM_ONE, "Team Leader");
    }
}
