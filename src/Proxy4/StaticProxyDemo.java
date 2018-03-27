package Proxy4;

public class StaticProxyDemo implements Person {

  private Person o;
  private String className = this.getClass().getName();

  public StaticProxyDemo(Person o) {
    this.o = o;
  }

  public static void main(String[] args) {

    Student s = new Student();

    StaticProxyDemo proxy = new StaticProxyDemo(s);

    proxy.sayHello("hi", 20);
    System.out.println("-----------");
    proxy.sayGoodBye(true,100);
  }

  @Override
  public void sayHello(String content, int age) {
    System.out.println(className + "sayHello begin");
    o.sayHello(content, age);
    System.out.println(className + "sayHello end");
  }

  @Override
  public void sayGoodBye(boolean seeAgin, double time) {
    System.out.println(className + "sayGoodBye begin");
    o.sayGoodBye(seeAgin, time);
    System.out.println(className + "sayGoodBye end");
  }
}
