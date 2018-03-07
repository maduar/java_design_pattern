package handler;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new GeneralManager();
        Handler handler2 = new DeptManager();
        Handler handler3 = new ProjectHandler();

        handler3.setSuccessor(handler2);
        handler2.setSuccessor(handler1);

        String test1 = handler3.handleRequest("ZHANGSAN", 300.00);
        System.out.println("test1 = " + test1);
        String test2 = handler3.handleRequest("ZHANGSAN", 1300.00);
        System.out.println("test2 = " + test2);
        System.out.println("---------------------------------------");
    }
}
