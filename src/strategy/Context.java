package strategy;

/*
 *
 * @author maduar
 * @date 28/03/2018 4:32 PM
 * @email maduar@163.com
 *
 * */
public class Context {
  private Strategy strategy;

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public void programLanguage() {
    this.strategy.programLanguage();
  }
}
