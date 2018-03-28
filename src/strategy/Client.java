package strategy;

/*
 *
 * @author maduar
 * @date 28/03/2018 4:33 PM
 * @email maduar@163.com
 *
 * */
public class Client {
  public static void main(String[] args) {
    Context context = new Context();
    context.setStrategy(new ConcreteStrategyJava());
    context.programLanguage();

    System.out.println();
    context.setStrategy(new ConcreteStrategyC());
    context.programLanguage();

    System.out.println();
    context.setStrategy(new ConcreteStrategyWeb());
    context.programLanguage();
  }
}
