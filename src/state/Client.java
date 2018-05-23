package state;

public class Client {

  public static void main(String[] args) {
    Context context = new Context();
    context.setValue(0);
    context.request();
  }
}
