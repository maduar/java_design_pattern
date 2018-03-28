package strategy;

/*
 *
 * @author maduar
 * @date 28/03/2018 4:31 PM
 * @email maduar@163.com
 *
 * */
public class ConcreteStrategyWeb implements Strategy{
  @Override
  public void programLanguage() {
    System.out.println("Use Web to program this APP !");
  }
}
