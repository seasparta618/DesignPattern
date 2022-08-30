package patterns.ResponsibilityChainPattern;

public class LeaveRequest {
    private String requestPersonName;
    private int numberOfDayOff;
    private String reason;

    public String getRequestPersonName() {
        return requestPersonName;
    }

    public int getNumberOfDayOff() {
        return numberOfDayOff;
    }

    public String getReason() {
        return reason;
    }

    private LeaveRequest(){

    }

    private LeaveRequest(Builder maker) {
        this.requestPersonName = maker.requestPersonName;
        this.numberOfDayOff = maker.numberOfDayOff;
        this.reason = maker.reason;
    }

    public static final class Builder {

        private String requestPersonName;
        private int numberOfDayOff;
        private String reason;

        public Builder requestPersonName(String requestPersonName) {
            this.requestPersonName = requestPersonName;
            return this;
        }

        public Builder numberOfDayOff(int numberOfDayOff) {
            this.numberOfDayOff = numberOfDayOff;
            return this;
        }

        public Builder reason(String note) {
            this.reason = note;
            return this;
        }

        public LeaveRequest build() {
            return new LeaveRequest(this);
        }

    }
}
