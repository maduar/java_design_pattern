package handler3;

public class ControllerHandler1 extends Handler{
    @Override
    protected Level getHandlerLevel() {
        return new Level(1);
    }

    @Override
    public Response response(Request request) {
        System.out.println("该请求由 ConcreteHandler1 处理");
        return new Response("响应结果 1");
    }
}
