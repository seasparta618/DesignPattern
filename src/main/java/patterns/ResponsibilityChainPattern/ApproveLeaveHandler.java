package patterns.ResponsibilityChainPattern;

public abstract class ApproveLeaveHandler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_TEN = 10;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    private String level;

    private int minDays;
    private int maxDays;

    private ApproveLeaveHandler nextApproveLeave;

    public ApproveLeaveHandler(int minDays, int maxDays, String level) {
        this.minDays = minDays;
        this.maxDays = maxDays;
        this.level = level;
    }

    public ApproveLeaveHandler(int minDays) {
        this.minDays = minDays;
    }

    public ApproveLeaveHandler() {
    }

    // set the next level who approves leave request
    public void setNextApproveLeave(ApproveLeaveHandler nextApproveLeave) {
        this.nextApproveLeave = nextApproveLeave;
    }

    protected abstract void handle(LeaveRequest leaveRequest);

    public final void approve(LeaveRequest leaveRequest) {
        this.handle(leaveRequest);
        if (this.nextApproveLeave != null && leaveRequest.getNumberOfDayOff() > this.maxDays) {
            System.out.println(this.getLevel() + " cannot approve the leave request, permission not enough");
            System.out.println();
            this.nextApproveLeave.approve(leaveRequest);
        } else if (this.nextApproveLeave == null && leaveRequest.getNumberOfDayOff() > this.maxDays) {
            System.out.println(this.getLevel() + " cannot approve leave request, no further approver could be found");
            System.out.println();
        } else if (leaveRequest.getNumberOfDayOff() <= this.maxDays) {
            System.out.println("Leave request has been approved by " + this.getLevel());
            System.out.println();
        }
    }

}
