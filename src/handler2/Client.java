package handler2;

public class Client {
    public static void main(String[] args) {
        Leader director = ClientHelp.getDirectorInstane();
        LeaveRequest lr = new LeaveRequest("孟尝", 15, "头疼");
        director.handlerRequest(lr);
    }
}
