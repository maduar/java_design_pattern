package state;

public class ConcreteState extends State {

  @Override
  public void handle() {
    System.out.println("state handle");
  }
}
