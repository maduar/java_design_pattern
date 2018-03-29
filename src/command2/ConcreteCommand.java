package command2;

/*
 *
 * @author maduar
 * @date 28/03/2018 5:16 PM
 * @email maduar@163.com
 *
 * */
public class ConcreteCommand implements Command{
  @Override
  public void exec() {
    Receiver receiver = new Receiver();
    receiver.action();
  }
}
