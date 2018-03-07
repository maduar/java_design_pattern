package handler;

public abstract class Handler {

    /*
    * 持有后继的责任对象
    * */
    protected Handler successor = null;

    public abstract String handleRequest(String user, Double fee);


    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
