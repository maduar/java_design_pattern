package state;

public class ConcreteStateB extends State {

  public ConcreteStateB() {
  }

  @Override
  public void handle() {
    System.out.println("ConcreteStateB state " );
  }
}
