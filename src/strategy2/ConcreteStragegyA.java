package strategy2;

public class ConcreteStragegyA extends AbstractStrategy{

  @Override
  public void algorithm() {
    String method = Thread.currentThread().getStackTrace()[1].getMethodName();
    String clazzName = this.getClass().getName();
    System.out.println("clazzName: " + clazzName + "; method: " + method + " .");
  }

  public static void main(String[] args) {
    ConcreteStragegyA concreteStragegyA = new ConcreteStragegyA();
    concreteStragegyA.algorithm();
  }
}
