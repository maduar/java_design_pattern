package handler4;

public class BorrowRequest {
    private int requestMoney;

    public BorrowRequest(int money) {
        System.out.println("有新请求，需要借款 " + money + " 元");
        this.requestMoney = money;
    }

    public int getRequestMoney() {
        return requestMoney;
    }
}
