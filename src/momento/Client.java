package momento;

public class Client {

  public static void main(String[] args) {
    Originator o = new Originator();
    CareTaker c = new CareTaker();

    o.setState("on");
    c.saveMemento(o.createMenonto());

    o.setState("off");
    o.restorememento(c.retrieveMemento());
    System.out.println(o.getState());
  }
}
