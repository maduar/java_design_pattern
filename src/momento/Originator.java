package momento;

public class Originator {

  private String state;

  /**
   * 工厂方法，返回一个新的备忘录对象
   */
  public Memento createMenonto() {
    return new Memento(state);
  }

  /**
   * 将发起人恢复到备忘录对象所记载的状态
   */
  public void restorememento(Memento memento) {
    this.state = memento.getState();
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }
}
