package state;

public class Context {

  private State state;
  private int value;

  public void setState(State state) {
    this.state = state;
  }

  public void request() {
    state.handle();
  }

  public void changeState() {
    if (value == 0) {
      State state = new ConcreteStateA();
      this.setState(state);
    } else {
      State state = new ConcreteStateB();
      this.setState(state);
    }
  }

  public void setValue(int value) {
    this.value = value;
    changeState();
  }
}
