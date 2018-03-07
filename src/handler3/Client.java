package handler3;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new ControllerHandler1();
        Handler h2 = new ControllerHandler2();
        Handler h3 = new ControllerHandler3();

        h1.setNextHander(h2);
        h2.setNextHander(h3);

        Response res1 = h1.handlerRequest(new Request(new Level(2)));
        if (res1 != null){
            System.out.println(res1.getResponse());
        }

        Response res2 = h1.handlerRequest(new Request(new Level(4)));
        if (res2 != null){
            System.out.println(res2.getResponse());
        }

    }
}
