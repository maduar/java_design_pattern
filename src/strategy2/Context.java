package strategy2;

public class Context {
  private AbstractStrategy strategy;

  public void setStrategy(AbstractStrategy strategy) {
    this.strategy = strategy;
  }

  public void algorithm() {
    strategy.algorithm();
  }
}
