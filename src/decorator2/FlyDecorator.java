/*
 *
 * @author maduar
 * @date 27/03/2018 4:10 PM
 * @email maduar@163.com
 *
 * */

package decorator2;

public  class FlyDecorator extends CarDecorator{
  public FlyDecorator(Car car) {
    super(car);
  }

  @Override
  public void run() {

  }

  @Override
  public void show() {
    this.getCar().show();
    this.fly();
  }

  public void fly() {
    System.out.println("可以飞");
  }
}
