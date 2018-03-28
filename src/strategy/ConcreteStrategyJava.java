package strategy;

/*
 *
 * @author maduar
 * @date 28/03/2018 4:30 PM
 * @email maduar@163.com
 *
 * */
public class ConcreteStrategyJava implements Strategy{
  @Override
  public void programLanguage() {
    System.out.println("Use Java to Program this app !");
  }
}
