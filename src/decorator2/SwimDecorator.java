/*
 *
 * @author maduar
 * @date 27/03/2018 4:11 PM
 * @email maduar@163.com
 *
 * */

package decorator2;

public class SwimDecorator extends CarDecorator{
  public SwimDecorator(Car car) {
    super(car);
  }


  @Override
  public void run() {

  }

  @Override
  public void show() {
    this.getCar().show();
    this.swim();
  }

  public void swim() {
    System.out.println("可以游");
  }
}
