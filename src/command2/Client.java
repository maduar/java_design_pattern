package command2;

/*
 *
 * @author maduar
 * @date 28/03/2018 5:19 PM
 * @email maduar@163.com
 *
 * */
public class Client {
  public static void main(String[] args) {
    Invoker invoker = new Invoker(new ConcreteCommand());
    invoker.calling();
  }
}
