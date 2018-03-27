package Proxy4;

public class Student implements Person {
  @Override
  public void sayHello(String content, int age) {
    System.out.println("Student say hello" + content + " " + age);
  }

  @Override
  public void sayGoodBye(boolean seeAgin, double time) {
    System.out.println("Student sayGoodBye " + time + " " + seeAgin);
  }
}
