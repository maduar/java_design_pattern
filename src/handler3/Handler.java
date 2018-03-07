package handler3;

public abstract class Handler {
    private Handler nextHander = null;

    public void setNextHander(Handler nextHander) {
        this.nextHander = nextHander;
    }

    public final Response handlerRequest(Request request){
        Response response = null;

        if(this.getHandlerLevel().above(request.getLevel())) {
            response = this.response(request);
        } else {
            System.out.println(this.getClass().getCanonicalName() + "无法处理请求.");
            if (nextHander != null) {
                response = this.nextHander.handlerRequest(request);
            } else {
                System.out.println("没有合适的处理器处理该请求...");
            }
        }

        return response;
    }

    protected abstract Level getHandlerLevel();
    public abstract Response response(Request request);

}
