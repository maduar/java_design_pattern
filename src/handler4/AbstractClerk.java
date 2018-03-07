package handler4;

public abstract class AbstractClerk {
    private AbstractClerk superior = null;
    protected String type;

    public void approveRequest(BorrowRequest request) {
        if(getLimit() >= request.getRequestMoney()) {
            System.out.println(getType() + "同意借款请求");
        } else {
            System.out.println(getType() + "级别不够，无法处理贷款请求");
            if (this.superior != null) {
                this.superior.approveRequest(request);
            } else {
                System.out.println("没人可以处理请求");
            }
        }
    }

    public void setSuperior(AbstractClerk superior) {
        this.superior = superior;
    }

    public String getType() {
        return type;
    }

    public abstract int getLimit();
}
