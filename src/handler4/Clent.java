package handler4;

public class Clent {
    public static void main(String[] args) {
        AbstractClerk clerk = ClentHelp.getClerkInstane();

        clerk.approveRequest(new BorrowRequest(10000));
        clerk.approveRequest(new BorrowRequest(1120000));
    }
}
