package mediator2;

/*
 *
 * @author maduar
 * @date 29/03/2018 1:12 PM
 * @email maduar@163.com
 *
 * */
public class ConcreteColleagueAndroirDeveloper extends Colleague{
  public ConcreteColleagueAndroirDeveloper(String name, Mediator mediator) {
    super(name, mediator);
  }

  public void constact(String message) {
    mediator.constact(message, this);
  }

  public void getMessage(String message) {
    System.out.println("Android Developer#" + name + "#: " + message);
  }
}
