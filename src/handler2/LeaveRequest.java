package handler2;

public class LeaveRequest {
    private String name;
    private int leaveDays;
    private String reason;

    public LeaveRequest(String name, int leaveDays, String reason) {
        this.name = name;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public String getReason() {
        return reason;
    }
}
