package mediator2;

/*
 *
 * @author maduar
 * @date 29/03/2018 1:08 PM
 * @email maduar@163.com
 *
 * */
public abstract class Colleague {
  protected String name;
  protected Mediator mediator;

  public Colleague(String name, Mediator mediator) {
    this.name = name;
    this.mediator = mediator;
  }
}
