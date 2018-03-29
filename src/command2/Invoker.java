package command2;

/*
 *
 * @author maduar
 * @date 28/03/2018 5:18 PM
 * @email maduar@163.com
 *
 * */
public class Invoker {
  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public Invoker(Command command) {

    this.command = command;
  }

  public void calling() {
    if (command != null) {
      command.exec();
    }
  }
}
