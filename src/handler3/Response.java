package handler3;

public class Response {
    private String response;

    public Response(String response) {
        this.response = response;
    }

    public String getResponse() {
        System.out.println("处理完请求");
        return response;
    }
}
