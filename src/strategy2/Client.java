package strategy2;

public class Client {

  public static void main(String[] args) {
    AbstractStrategy strategy;
    strategy = new ConcreteStragegyA();

    Context context = new Context();
    context.setStrategy(strategy);

    context.algorithm();
  }
}
