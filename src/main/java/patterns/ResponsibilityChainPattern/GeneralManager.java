package patterns.ResponsibilityChainPattern;

public class GeneralManager extends ApproveLeaveHandler {
    @Override
    protected void handle(LeaveRequest leaveRequest) {
        System.out.println(this.getLevel() + " received leave request from "+leaveRequest.getRequestPersonName() + "  for " + leaveRequest.getNumberOfDayOff() + " days with reason " + leaveRequest.getReason());
        System.out.println("General manager is trying to approve");
    }

    public GeneralManager() {
        super(ApproveLeaveHandler.NUM_THREE, ApproveLeaveHandler.NUM_TEN, "General manager");
    }
}
